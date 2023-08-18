import java.io.*;

public class Main {
    static int N;
    static int M;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] map;

    public static void dfs(int st, int depth) throws IOException {
        if(depth == M){
            for(int i : map){
                bw.append(i + " ");
            }
            bw.append("\n");
            return;
        }

        for (int i = st; i <= N; i++) {

            map[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String NM[] = br.readLine().split(" ");
        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);
        map = new int[M];

        dfs(1, 0);

        bw.flush();
        bw.close();
        br.close();
    }

}

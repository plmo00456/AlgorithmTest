import java.io.*;

public class Main {
    public static int[] map;
    public static int N;
    public static int count = 0;

    public static void dfs(int depth){
        if(depth == N){
            count++;
            return;
        }

        for(int i=0; i<N; i++){
            map[depth] = i;
            if(Possibility(depth)){
                dfs(depth + 1);
            }
        }
    }

    public static boolean Possibility(int depth) {

        for (int i = 0; i < depth; i++) {
            if (map[depth] == map[i]) {
                return false;
            }else if (Math.abs(depth - i) == Math.abs(map[depth] - map[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        map = new int[N];

        dfs(0);

        bw.append(count+"");
        bw.flush();
        bw.close();
        br.close();

    }

}
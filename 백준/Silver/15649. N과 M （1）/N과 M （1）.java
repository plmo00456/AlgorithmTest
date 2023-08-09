import java.io.*;

public class Main {

    static int[] map;
    static boolean[] visited;

    static int N, M;
    static BufferedWriter bw;

    public static void dfs(int cnt) throws IOException {
        if(cnt == M)
        {
            for(int i = 0; i < M; i++)
                bw.append(map[i] + " ");
            bw.append("\n");
            return;
        }else{
            for(int i = 1; i <= N; i++)
            {
                if(!visited[i])
                {
                    visited[i] = true;
                    map[cnt] = i;
                    dfs(cnt+1);
                    visited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] NM = br.readLine().split(" ");

        N = Integer.parseInt(NM[0]);
        M = Integer.parseInt(NM[1]);

        map = new int[N+1];
        visited = new boolean[N+1];

        dfs(0);

        br.close();
        bw.flush();
        bw.close();
    }
}

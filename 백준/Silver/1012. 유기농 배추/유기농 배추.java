import java.io.*;

public class Main {

    public static boolean[][] visited;
    public static int[][] map;
    public static int ans = 0;

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void dfs(int x, int y) {
        visited[y][x] = true;

        for(int i=0; i<4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(map[y][x] == 1 && cx >= 0 && cy >= 0 && cx < map[0].length && cy < map.length && !visited[cy][cx]){
                dfs(cx, cy);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] MNK = br.readLine().split(" ");
            int M = Integer.parseInt(MNK[0]);   //세로
            int N = Integer.parseInt(MNK[1]);   //가로
            int K = Integer.parseInt(MNK[2]);   //배추개수
            map = new int[N][M];
            visited = new boolean[N][M];
            ans = 0;
            for (int j = 0; j < K; j++) {
                String[] XY = br.readLine().split(" ");
                int X = Integer.parseInt(XY[0]);
                int Y = Integer.parseInt(XY[1]);
                map[Y][X] = 1;
            }
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if(!visited[j][k] && map[j][k] == 1){
                        dfs(k, j);
                        ans++;
                    }
                }
            }
            bw.append(ans+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
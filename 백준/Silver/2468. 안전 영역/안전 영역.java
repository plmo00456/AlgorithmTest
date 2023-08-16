import java.io.*;

public class Main {

    static int[][] map;
    static boolean[][] visited;
    static int cnt = 0;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int max = Integer.MIN_VALUE;
    static int ans = 0;

    public static void dfs(int x, int y, int m){
        visited[y][x] = true;
        for(int i=0; i<4; i++){
            int cx = dx[i] + x;
            int cy = dy[i] + y;

            if(cx >= 0 && cy >= 0 && cx < map[0].length && cy < map.length && !visited[cy][cx] && map[cy][cx] > m){
                dfs(cx, cy, m);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];
        for(int i=0; i<N; i++){
            String[] line = br.readLine().split(" ");
            for(int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(line[j]);
                max = Math.max(map[i][j], max);
            }
        }

        for(int m=max; m>=0; m--) {
            visited = new boolean[N][N];
            cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int x = j;
                    int y = i;
                    if (x < map[0].length && y < map.length && !visited[y][x] && map[y][x] > m) {
                        dfs(x, y, m);
                        cnt++;
                        ans = Math.max(ans, cnt);
                    }
                }
            }
        }

        bw.append(ans+"");
        br.close();
        bw.flush();
        bw.close();

    }
}

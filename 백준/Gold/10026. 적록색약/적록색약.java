import java.io.*;

public class Main {
    static char[][] map;
    static boolean[][] visited;
    static boolean[][] visited2;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};


    public static void dfs(int x, int y, int mode){
        visited[y][x] = true;

        for(int i=0; i<4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx >= 0 && cy >= 0 && cx < map.length && cy < map.length && !visited[cy][cx]){
                if(mode == 0 && map[cy][cx] == 'R')
                    dfs(cx, cy, mode);
                else if(mode == 1 && map[cy][cx] == 'G')
                    dfs(cx, cy, mode);
                else if(mode == 2 && map[cy][cx] == 'B')
                    dfs(cx, cy, mode);
            }
        }
    }

    public static void dfs2(int x, int y, int mode){
        visited2[y][x] = true;

        for(int i=0; i<4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx >= 0 && cy >= 0 && cx < map.length && cy < map.length && !visited2[cy][cx]){
                if(mode == 0 && (map[cy][cx] == 'R' || map[cy][cx] == 'G'))
                    dfs2(cx, cy, mode);
                else if(mode == 1 && map[cy][cx] == 'B')
                    dfs2(cx, cy, mode);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        visited = new boolean[N][N];
        visited2 = new boolean[N][N];
        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<N; j++){
                char c = line.charAt(j);
                map[i][j] = c;
            }
        }

        int cnt = 0;
        int cnt2 = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(j < map.length && i < map.length && !visited[j][i]){
                    if(map[j][i] == 'R') {
                        dfs(i, j, 0);
                        cnt++;
                    }else if(map[j][i] == 'G') {
                        dfs(i, j, 1);
                        cnt++;
                    }else if(map[j][i] == 'B') {
                        dfs(i, j, 2);
                        cnt++;
                    }
                }
                if(j < map.length && i < map.length && !visited2[j][i]){
                    if((map[j][i] == 'R' || map[j][i] == 'G')) {
                        dfs2(i, j, 0);
                        cnt2++;
                    }else if(map[j][i] == 'B') {
                        dfs2(i, j, 1);
                        cnt2++;
                    }
                }
            }
        }
        bw.append(cnt + " " + cnt2);

        bw.flush();
        bw.close();
        br.close();
    }

}
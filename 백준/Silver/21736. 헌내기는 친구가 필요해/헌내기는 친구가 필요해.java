import java.io.*;

public class Main {

    static char[][] map;
    static boolean[][] visited;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int cnt = 0;

    public static void dfs(int x, int y){
        if(map[y][x] == 'P') cnt++;
        visited[y][x] = true;

        for(int i=0; i<4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];
            if(cx >= 0 && cy >= 0 && cx < map[0].length && cy < map.length && map[cy][cx] != 'X' && !visited[cy][cx]){
                dfs(cx, cy);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);    //세로
        int M = Integer.parseInt(NM[1]);    //가로
        if(N == 0 || M == 0){
            bw.append("TT");
        }else{
            visited = new boolean[N][M];
            map = new char[N][M];
            int[] start = new int[2];
            for(int i=0; i<N; i++){
                String line = br.readLine();
                for(int j=0; j<M; j++){
                    char c = line.charAt(j);
                    if(c == 'I') start = new int[]{j, i};
                    else if(c == 'X') visited[i][j] = true;
                    map[i][j] = c;
                }
            }

            dfs(start[0], start[1]);
            bw.append(cnt == 0 ? "TT" : cnt + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
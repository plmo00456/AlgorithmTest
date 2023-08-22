import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int[][] map;
    static int[][] map2;
    static boolean[][] visited;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, -1, 0, 1};
    static int start[] = new int[2];

    public static void bfs(){
        int x = start[0];
        int y = start[1];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[y][x] = true;

        while(!q.isEmpty()){
            int[] xy = q.poll();
            x = xy[0];
            y = xy[1];
            for(int i=0; i<4; i++){
                int cx = dx[i] + x;
                int cy = dy[i] + y;

                if(cx >= 0 && cy >= 0 && cx < map[0].length && cy < map.length && map[cy][cx] == 1 && !visited[cy][cx]){
                    q.add(new int[]{cx, cy});
                    map2[cy][cx] = map2[y][x] + 1;
                    visited[cy][cx] = true;
                    map[cy][cx] = -1;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] NM = br.readLine().split(" ");

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        map = new int[N][M];
        map2 = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            String line[] = br.readLine().split(" ");
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(line[j]);
                if(map[i][j] == 2){
                    start[0] = j;
                    start[1] = i;
                }
            }
        }

        bfs();

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j] == 1)
                    bw.append(-1 + " ");
                else
                    bw.append(map2[i][j] + " ");
            }
            bw.append("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
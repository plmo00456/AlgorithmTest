import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int finalX;
    static int finalY;
    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static int ans = Integer.MAX_VALUE;

    public static void bfs(int x, int y, int cnt){
        Queue<int[]> q = new LinkedList<>();

        if(map[x][y] == 1){
            q.add(new int[]{x,y,0});
            visited[x][y] = true;
            cnt++;
        }
        while(!q.isEmpty()){
            int[] xy = q.poll();
            x = xy[0];
            y = xy[1];
            cnt = xy[2];

            if(x == finalX && y == finalY){
                ans = Math.min(ans, ++cnt);
                return;
            }

            for(int i=0; i<4; i++){
                int cx = x + dx[i];
                int cy = y + dy[i];
                if(cx >= 0 && cy >= 0 && cx <= finalX && cy <= finalY){
                    if (map[cx][cy] == 1 && !visited[cx][cy]) {
                        visited[cx][cy] = true;
                        q.add(new int[]{cx, cy, cnt + 1});
                    }
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
        finalX = M-1;
        finalY = N-1;

        map = new int[M][N];
        visited = new boolean[M][N];

        for(int i=0; i<N; i++){
            String[] str = br.readLine().split("");
            for(int j=0; j<M; j++){
                map[j][i] = Integer.parseInt(str[j]);
            }
        }

        bfs(0, 0, 0);

        bw.append(ans+"");
        bw.close();
        br.close();
    }
}

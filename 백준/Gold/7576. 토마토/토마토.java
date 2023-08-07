import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int map[][];
    static boolean visited[][];
    static int cnt = 0;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void bfs(){
        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(map[i][j] == 1){
                    q.add(new int[]{j, i});
                    visited[i][j] = true;
                }
            }
        }
        while(!q.isEmpty()){

            int[] xy = q.poll();
            for(int i=0; i<4; i++){
                int cx = xy[0] + dx[i];
                int cy = xy[1] + dy[i];
                if(cx >= 0 && cy >= 0 && cx < map[0].length && cy < map.length && !visited[cy][cx] && map[cy][cx] == 0){
                    map[cy][cx] = map[xy[1]][xy[0]] + 1;
                    cnt = Math.max(cnt, map[xy[1]][xy[0]] + 1);
                    visited[cy][cx] = true;

                    q.add(new int[]{cx, cy});
                }
            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] AB = br.readLine().split(" ");
        int A = Integer.parseInt(AB[0]);
        int B = Integer.parseInt(AB[1]);

        map = new int[B][A];
        visited = new boolean[B][A];

        for(int i=0; i<B; i++){
            String[] line = br.readLine().split(" ");
            for(int j=0; j<A; j++){
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        bfs();
        for(int i=0; i<B; i++){
            for(int j=0; j<A; j++){
                if(map[i][j] == 0){
                    cnt = -1;
                    break;
                }
            }
        }
        bw.append((cnt == -1 ? -1 : cnt == 0 ? 0 : (cnt-1))+"");

        bw.flush();
        bw.close();
        br.close();
    }
}

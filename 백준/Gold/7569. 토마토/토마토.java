import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int[][][] map;
    static int[][][] map2;
    static boolean[][][] visited;
    static int cnt = 0;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int max = Integer.MIN_VALUE;
    static int ans = 0;

    public static void bfs(){
        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                for(int k=0; k<map[i][j].length; k++){
                    if(map[i][j][k] == 1) {
                        q.add(new int[]{k, j, i});
                        visited[i][j][k] = true;
                        map2[i][j][k] = 1;
                    }else if(map[i][j][k] == -1){
                        map2[i][j][k] = -1;
                    }
                }
            }
        }


        while(!q.isEmpty()){
            int[] xyz = q.poll();

            int ox = xyz[0];
            int oy = xyz[1];
            int oz = xyz[2];
            for(int j=0; j<6; j++){
                int cx;
                int cy;
                int cz;

                if(j == 4){
                    cx = xyz[0];
                    cy = xyz[1];
                    cz = xyz[2] - 1;
                }else if(j == 5) {
                    cx = xyz[0];
                    cy = xyz[1];
                    cz = xyz[2] + 1;
                }else{
                    cx = dx[j] + xyz[0];
                    cy = dy[j] + xyz[1];
                    cz = xyz[2];
                }

                if(cz >= 0 && cy >= 0 && cx >= 0 &&
                    cz < map.length && cy < map[0].length && cx < map[0][0].length &&
                    !visited[cz][cy][cx] && map[cz][cy][cx] == 0){
                        map2[cz][cy][cx] = map2[oz][oy][ox] + 1;
                        visited[cz][cy][cx] = true;
                        q.add(new int[]{cx, cy, cz});
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] XYZ = br.readLine().split(" ");
        int X = Integer.parseInt(XYZ[0]);
        int Y = Integer.parseInt(XYZ[1]);
        int Z = Integer.parseInt(XYZ[2]);


        map = new int[Z][Y][X];
        map2 = new int[Z][Y][X];
        visited = new boolean[Z][Y][X];
        for(int k=0; k<Z; k++){
            for(int i=0; i<Y; i++){
                String[] line = br.readLine().split(" ");
                for(int j=0; j<X; j++) {
                    map[k][i][j] = Integer.parseInt(line[j]);
                }
            }
        }

        bfs();

        boolean chk = false;
        int max = Integer.MIN_VALUE;
        for(int k=0; k<Z; k++) {
            for (int i = 0; i < Y; i++) {
                for (int j = 0; j < X; j++) {
                    if(map2[k][i][j] == 0)
                        chk = true;
                    max = Math.max(max, map2[k][i][j]);
                }
            }
        }

        bw.append((chk ? -1 : max == 0 ? 0 : max - 1) +"");
        br.close();
        bw.flush();
        bw.close();

    }
}

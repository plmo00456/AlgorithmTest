import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    static boolean[][] visited;
    static int[][] map;
    static List<Integer> ans = new ArrayList<>();

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});

        int cnt = 1;
        while(!q.isEmpty()){
            int[] xy = q.poll();
            for(int i=0; i<4; i++){
                x = xy[0] + dx[i];
                y = xy[1] + dy[i];
                if(x >= 0 && y >= 0 && x < map[0].length && y < map.length && map[y][x] == 1 && !visited[y][x]){
                    visited[y][x] = true;
                    q.add(new int[]{x, y});
                    cnt++;
                }
            }
        }
        return cnt != 1 ? cnt - 1 : cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        visited = new boolean[N+1][N+1];
        map = new int[N+1][N+1];
        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(line.charAt(j)+"");
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j] && map[i][j] == 1){
                    ans.add(bfs(j, i));
                }
            }
        }
        ans.sort(null);
        bw.append(ans.size()+"\n");
        for(int i : ans){
            bw.append(i+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
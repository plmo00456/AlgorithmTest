import java.util.*;

class Solution {
    public int[][] map;
    public boolean[][] visited;
    public int cnt = Integer.MAX_VALUE;
    
    public int[] cx = {1, 0, -1, 0};
    public int[] cy = {0, 1, 0, -1};
    
    public void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y, 1});
        visited[y][x] = true;
        while(!q.isEmpty()){
            int[] xy = q.poll();
            if(xy[0] == map[0].length-1 && xy[1] == map.length-1){
                cnt = Math.min(cnt, xy[2]);
            }
            for(int i=0; i<4; i++){
                int dx = xy[0] + cx[i];
                int dy = xy[1] + cy[i];
                
                if(dx >= 0 && dy >= 0 && dx < map[0].length && dy < map.length && map[dy][dx] == 1 && !visited[dy][dx]){
                    q.add(new int[]{dx, dy, xy[2] + 1});
                    visited[dy][dx] = true;
                }
            }
        }
    }
    
    public int solution(int[][] maps) {
        
        map = maps;
        visited = new boolean[map.length][map[0].length];
        
        bfs(0, 0);
        
        return cnt == Integer.MAX_VALUE ? -1 : cnt;
    }
}
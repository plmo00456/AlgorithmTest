import java.util.*;

class Solution {
    
    public int[][] map;
    public boolean[] visited;
    public int cnt = 0;
    public int N;
    
    public void dfs(int st){
        visited[st] = true;
        
        for(int i=0; i<N; i++){
            if(st != i && map[st][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        map = computers;
        N = n;
        visited = new boolean[n];
        
        int ans = 0;
        for(int i=0; i<N; i++){
            if(!visited[i]){
                dfs(i);
                ans++;
            }
        }
        
        System.out.println(ans);
        return ans;
    }
}
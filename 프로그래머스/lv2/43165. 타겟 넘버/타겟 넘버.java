class Solution {
    public int[] map;
    public int t;
    public int ans = 0;
    
    public void dfs(int sum, int cnt){
        if(cnt == map.length){
            if(sum == t) ans++;
            return;
        }else{
            dfs(sum + map[cnt], cnt + 1);
            dfs(sum - map[cnt], cnt + 1);
        }
    }
    
    
    public int solution(int[] numbers, int target) {
        
        t = target;
        map = numbers;
        
        dfs(0, 0);
        
        System.out.println(ans);
        
        return ans;
    }
}
import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<>();
    boolean[] visited;
    String str;
    
    public void dfs(String st, int cnt){
        if(cnt == str.length()){
            return;
        }
        for(int i=0; i<str.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                set.add(Integer.parseInt(st + str.charAt(i)));
                dfs(st + str.charAt(i), cnt + 1);
                visited[i] = false;
            }
        }
    }
    
    public int solution(String numbers) {
        str = numbers;
        visited = new boolean[str.length()];
        dfs("", 0);
        int answer = 0;
        for(int i : set){
            if(chk(i)){
                answer++;
                System.out.println(i);
            }
        }
        
        return answer;
    }
    
    public boolean chk(int x){
        if(x == 1 || x == 0) return false;
        for(int i=2; i<x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
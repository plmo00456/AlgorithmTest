class Solution {
    public int solution(int[][] sizes) {
        
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        for(int i=0; i<sizes.length; i++){
            int min = Math.min(sizes[i][0], sizes[i][1]);
            int max = Math.max(sizes[i][0], sizes[i][1]);
            
            a = Math.max(min, a);
            b = Math.max(max, b);
        }
        
        return a*b;
    }
}
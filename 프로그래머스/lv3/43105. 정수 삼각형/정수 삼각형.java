class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int N = triangle.length;
        int[][] dp = new int[N][N];
        dp[0][0] = triangle[0][0];
        for(int i=1; i<N; i++){
            for(int j=0; j<triangle[i].length; j++){
                if(j == 0) {
                	dp[i][j] = dp[i-1][j] + triangle[i][j];
                }else {
                	dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + triangle[i][j];
                }
            }
        }
        int max = 0;
        for(int i : dp[N-1]) {
        	max = Math.max(i, max);
        }
        System.out.println(max);
        return max;
    }
}
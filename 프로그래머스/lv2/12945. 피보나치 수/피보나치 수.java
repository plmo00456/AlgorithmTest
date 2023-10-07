import java.math.*;

class Solution {
    public int solution(int n) {
        BigInteger[] dp = new BigInteger[n+1];
        dp[0] = BigInteger.ZERO;
        if(n >= 1)
            dp[1] = BigInteger.ONE;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-2].add(dp[i-1]);
        }
        int answer = Integer.parseInt(dp[n].mod(new BigInteger("1234567"))+"");
        System.out.println(dp[n]);
        return answer;
    }
}
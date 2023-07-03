import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        BigInteger[] dp = new BigInteger[N+1];
        dp[0] = BigInteger.ZERO;
        if(N >= 1)
        	dp[1] = BigInteger.ONE;
        if(N >= 2)
        	dp[2] = BigInteger.TWO;
        for(int i=3; i<=N; i++) {
        	dp[i] = dp[i-2].add(dp[i-1]);
        }
        
        System.out.println(dp[N].remainder(new BigInteger("10007")));
    }
}

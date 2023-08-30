import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        BigInteger[] dp = new BigInteger[N+1];
        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;
        if(N > 1)
            dp[2] = new BigInteger("3");
        for(int i=3; i<=N; i++){
            dp[i] = BigInteger.TWO.multiply(dp[i-2]).add(dp[i-1]);
        }
        bw.append(dp[N].mod(new BigInteger("10007"))+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
import java.io.*;
import java.math.BigInteger;

public class Main {

    static BigInteger[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        dp = new BigInteger[N+1];

        dp[0] = BigInteger.ZERO;
        if(N > 0)
            dp[1] = BigInteger.ONE;
        for(int i=2; i<=N; i++){
            dp[i] = dp[i-2].add(dp[i-1]);
        }
        bw.append(dp[N]+"");

        br.close();
        bw.flush();
        bw.close();
    }
}

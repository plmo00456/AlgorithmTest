import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        BigInteger dp[] = new BigInteger[N+1];
        dp[1] = BigInteger.ONE;
        if(N > 1)
            dp[2] = BigInteger.TWO;
        for(int i=3; i<=N; i++)
            dp[i] = dp[i-2].add(dp[i-1]).mod(new BigInteger("15746"));
        bw.append(dp[N]+"");

        br.close();
        bw.flush();
        bw.close();

    }
}

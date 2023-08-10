import java.io.*;
import java.math.BigInteger;

public class Main {

    static BigInteger[] dp = new BigInteger[31];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        dp[1] = BigInteger.ONE;
        for(int i=2; i<=30; i++){
            dp[i] = dp[i-1].multiply(new BigInteger(i+""));
        }

        for(int i=0; i<T; i++){
            String NM[] = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);

            bw.append((M-N == 0 ? 1 : dp[M].divide(dp[M-N].multiply(dp[N])))+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

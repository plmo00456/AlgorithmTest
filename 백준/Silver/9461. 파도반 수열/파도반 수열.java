import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            long[] dp = new long[N+1];
            if(N >= 5) dp[5] = 2;
            if(N >= 4) dp[4] = 2;
            if(N >= 3) dp[3] = 1;
            if(N >= 2) dp[2] = 1;
            if(N >= 1) dp[1] = 1;

            for(int j=6; j<=N; j++){
                dp[j] = dp[j-1] + dp[j-5];
            }
            bw.append(dp[N]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N][3];
        String[] rgb = br.readLine().split(" ");

        dp[0][0] = Integer.parseInt(rgb[0]);
        dp[0][1] = Integer.parseInt(rgb[1]);
        dp[0][2] = Integer.parseInt(rgb[2]);

        for(int i=1; i<N; i++){
            rgb = br.readLine().split(" ");
            int R = Integer.parseInt(rgb[0]);
            int G = Integer.parseInt(rgb[1]);
            int B = Integer.parseInt(rgb[2]);

            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + R;
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + G;
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + B;
        }

        bw.append(Math.min(Math.min(dp[N-1][0], dp[N-1][1]), dp[N-1][02])+"");

        bw.flush();
        bw.close();
        br.close();
    }
}

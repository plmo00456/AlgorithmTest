import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	
    	int[][] dp = new int[3][41];
    	dp[1][0] = 1;
    	dp[2][0] = 0;
    	dp[1][1] = 0;
    	dp[2][1] = 1;
    	
    	for(int i=2; i<=40; i++) {
    		dp[1][i] = dp[1][i-2] + dp[1][i-1];
    		dp[2][i] = dp[2][i-2] + dp[2][i-1];
    	}
    	
    	for(int i=0; i<N; i++) {
    		int a = sc.nextInt();
    		System.out.println(dp[1][a] + " " + dp[2][a]);
    	}
    	
    }
}

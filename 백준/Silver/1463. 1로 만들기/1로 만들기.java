import java.util.Arrays;
import java.util.Scanner;

//X가 3으로 나누어 떨어지면, 3으로 나눈다.
//X가 2로 나누어 떨어지면, 2로 나눈다.
//1을 뺀다.

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] dp = new int[N+1];
    	if(N >= 2) {
    		dp[2] = 1;
    		if(N >= 3) {
    			dp[3] = 1;
    		}
    	}
    	
    	for(int i=4; i<=N; i++) {
    		if(i%6 == 0) {
    			dp[i] = Math.min(Math.min(dp[i/2], dp[i/3]), dp[i-1]) + 1;
    		}else if(i%2 == 0) {
    			dp[i] = Math.min(dp[i/2], dp[i-1]) + 1;
    		}else if(i%3 == 0) {
    			dp[i] = Math.min(dp[i/3], dp[i-1]) + 1;
    		}else {
    			dp[i] = dp[i-1] + 1;
    		}
    	}
    	System.out.println(dp[N]);
    }
}

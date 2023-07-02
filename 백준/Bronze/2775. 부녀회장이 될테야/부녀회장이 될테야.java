import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[][] dp = new int[15][16];
    	
    	int sum = 0;
    	for(int i=1; i<=14; i++) {
    		dp[0][i] = i;
    		dp[i-1][1] = 1;
    		sum += i;
    		dp[1][i] = sum;
    	}
    	
    	for(int i=2; i<=14; i++) {
    		sum = 0;
    		for(int j=1; j<=14; j++) {
    			sum+= dp[i-1][j];
    			dp[i][j] = sum;
    		}
    	}
    	
    	for(int i=0; i<N; i++) {
    		int k = sc.nextInt();
    		int n = sc.nextInt();
    		System.out.println(dp[k][n]);
    	}
    	
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int x = 2;
    	int z = 1;
    	for(int j=1; j<=N; j++) {
    		x += z;
    		z += z;
    	}
    	int sum = (int)Math.pow(x, 2);
    	System.out.println(sum);
    }
    
}
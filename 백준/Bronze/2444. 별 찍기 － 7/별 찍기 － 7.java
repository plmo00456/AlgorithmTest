import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for(int i=0; i<N; i++) {
    		for(int j=i; j<N-1; j++) {
    			System.out.print(" ");
    		}
    		for(int j=0; j<=i*2; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	for(int i=N-1; i>0; i--) {		// 2 1
    		for(int j=i; j<N; j++) {	// 2 2
    			System.out.print(" ");
    		}
    		for(int j=0; j<=(i*2)-2; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
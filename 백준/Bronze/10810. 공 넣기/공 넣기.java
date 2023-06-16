import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int[] N = new int[sc.nextInt()];
		int M = sc.nextInt();
		
		
		for(int x=0; x<M; x++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(; i<j; i++) {
				N[i] = k;
			}
		}
		for(int x=0; x<N.length; x++) {
			System.out.print(N[x] + " ");
		}
		
	}
}
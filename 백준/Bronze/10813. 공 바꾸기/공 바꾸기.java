import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int[] N = new int[sc.nextInt()];
		int M = sc.nextInt();
		
		for(int x=1; x<=N.length; x++) {
			N[x-1] = x;
		}
		for(int x=0; x<M; x++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			if(i != j) {				
				int tmp = N[i];
				N[i] = N[j];
				N[j] = tmp;
			}
		}
		for(int i : N) {
			System.out.print(i + " ");
		}
		
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int sum = 0;
		for(int i=0; i<B; i++) {
			sum += sc.nextInt() * sc.nextInt();
		}
		System.out.println(sum == A? "Yes" : "No");
	}
}
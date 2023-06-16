import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		B = B - 45;
		if(B < 0) {
			A -= 1;
			B += 60;
			if(A < 0)
				A = 23;
		}
		System.out.println(A + " " + B);
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(a1*n + a0 <= c * n && a1 <= c ? 1 : 0);
	}
}
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int M = sc.nextInt();
		System.out.println(N.substring(M-1, M));
		
	}
}
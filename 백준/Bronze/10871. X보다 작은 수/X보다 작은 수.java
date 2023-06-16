import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String ans = "";
		for(int i=0; i<A; i++) {
			int n = sc.nextInt();
			if(B > n) ans += n + " ";
		}
		
		System.out.println(ans.length() == 0?"" : ans.substring(0, ans.length() - 1));
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		String ans = "";
		for(int i=0; i<A/4; i++) {
			ans += "long ";
		}
		ans += "int";
		
		System.out.println(ans);
	}
}
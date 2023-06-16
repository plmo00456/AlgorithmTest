import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			int val = sc.nextInt();
			String str = sc.next();
			String ans = "";
			for(int j=0; j<str.length(); j++) {
				ans += (str.charAt(j)+"").repeat(val);
			}
			System.out.println(ans);
		}
	}
}
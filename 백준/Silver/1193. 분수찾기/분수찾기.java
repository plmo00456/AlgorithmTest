import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int cnt = 1;
		int a = 1;
		while(a < N) {
			a += cnt;
			if(a <= N) {
				cnt++;
			}
		}
		int b = 0;
		if(a > N) {
			b = N - (a - cnt);
		}
		if(cnt % 2 == 0)
			System.out.println(b+1 + "/" + (cnt-b));
		else
			System.out.println(cnt-b + "/" + (b+1));
    }
    
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int cnt = A;
		for(int i=0; i<A; i++) {
			int B = sc.nextInt();
			if(B == 1) cnt--;
			for(int j = 1; j<B; j++) {
				if(j != 1 && B % j == 0) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
		
	}
    
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = A; i<=B; i++) {
			if(i == 1) continue;
			boolean chk = true;
			for(int j=2; j<i; j++) {
				if(i % j == 0) {
					chk = false;
					break;
				}
			}
			if(chk) {
				sum += i;
				min = Math.min(min, i);
			}
		}
		
		if(A == 0 || B == 1 || B == 0 || sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
    
}
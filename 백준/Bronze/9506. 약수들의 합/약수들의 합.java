import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int A = sc.nextInt();
			if(A == -1) break;
			System.out.print(A);
			List<Integer> list = new ArrayList<>();
			int sum = 0;
			String str = "";
			for(int i=1; i<A; i++) {
				if(A % i == 0) {
					list.add(i);
					if(i == 1)
						str += " = " + i;
					else
						str += " + " + i;
					sum += i;
				}
			}
			System.out.println(sum == A ? str : " is NOT perfect.");
		}
		
	}
    
}
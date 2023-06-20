import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int i = 2;
		int x = 1;
		while(A > 1) {
			if(A % i == 0) {
				A = A / i;
				System.out.println(i);
			}else {
				i++;
			}
		}
		
		
	}
    
}
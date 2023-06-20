import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			if(A == 0 && B == 0 && C == 0) break;
			
			int[] ABC = new int[3];
			ABC[0] = A;
			ABC[1] = B;
			ABC[2] = C;
			Arrays.sort(ABC);
			
			if(A == B && B == C && A == C)
				System.out.println("Equilateral");
			else if(ABC[2] >= ABC[0] + ABC[1])
				System.out.println("Invalid");
			else if(A == B || B == C || A == C)
				System.out.println("Isosceles");
			else if(A != B && B != C && A != C)
				System.out.println("Scalene");
		}
	}
}
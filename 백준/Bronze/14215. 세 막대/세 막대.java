import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] ABC = new int[3];
		ABC[0] = A;
		ABC[1] = B;
		ABC[2] = C;
		Arrays.sort(ABC);
		
		if(A == B && B == C && A == C)
			System.out.println(A + B + C);
		else if(ABC[2] >= ABC[0] + ABC[1]) {
			for(int i=ABC[2]; i>=0; i--) {
				if(i < ABC[0] + ABC[1]) {
					System.out.println(i + ABC[0] + ABC[1]);
					break;
				}
			}
		}else {
			System.out.println(A + B + C);
		}
	}
}
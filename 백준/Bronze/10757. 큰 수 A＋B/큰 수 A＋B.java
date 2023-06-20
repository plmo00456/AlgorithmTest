import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		BigInteger AL = new BigInteger(A);
		BigInteger BL = new BigInteger(B);
		System.out.println(AL.add(BL));
	}
    
}
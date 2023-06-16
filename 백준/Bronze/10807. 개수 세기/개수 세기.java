import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int[] nums = new int[A];
		for(int i=0; i<A; i++) nums[i] = sc.nextInt();
		int C = sc.nextInt();
		
		int ans = 0;
		for(int i=0; i<A; i++)
			if(nums[i] == C)
				ans++;
		System.out.println(ans);
	}
}
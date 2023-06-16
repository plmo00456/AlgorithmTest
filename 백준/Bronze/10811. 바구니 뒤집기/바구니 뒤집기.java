import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int nums[] = new int[N];
		for(int i=1; i<=N; i++) {
			nums[i-1] = i;
		}
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int tmp[] = new int[b-a+1];
			for(int j=0; j<tmp.length; j++) {
				tmp[j] = nums[b-1-j];
			}
			for(int j : tmp) {
				nums[(a++)-1] = j;
			}
		}
		
		for(int i : nums) {
			System.out.print(i + " ");
		}
		
	}
}
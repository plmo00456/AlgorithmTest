import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int val = Integer.MAX_VALUE;
		if(x > w-x) {
			val = Math.min(val, w-x);
		}else {
			val = Math.min(val, x);
		}
		
		if(y > h-y) {
			val = Math.min(val, h-y);
		}else {
			val = Math.min(val, y);
		}
		System.out.println(val);
	}
}
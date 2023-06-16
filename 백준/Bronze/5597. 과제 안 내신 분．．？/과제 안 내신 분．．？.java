import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int[] N = new int[30];
		
		String str;
		while(sc.hasNextLine() && !((str = sc.nextLine()).equals(""))) {
			if(str == null || str.equals("")) break;
			N[Integer.parseInt(str)-1] = 1;
		}
		sc.close();
		int i=1;
		for(int j : N) {
			if(j == 0) System.out.println(i);
			i++;
		}
		
	}
}
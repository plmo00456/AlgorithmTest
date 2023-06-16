import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		System.out.println(str.length() == 0 ? 0 : str.split(" ").length);
	}
}
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		for(int i=0; i<N; i++) {
			Stack<String> stack = new Stack<>();
			String str = sc.nextLine();
			boolean a = true;
			for(int j=0; j<str.length(); j++) {
				if((str.charAt(j)+"").equals("("))
					stack.push(str.charAt(j)+"");
				else if((str.charAt(j)+"").equals(")")) {
					try {
						stack.pop();
					}catch(EmptyStackException e) {
						a = false;
						break;
					}
				}
			}
			System.out.println(stack.isEmpty() && a ? "YES" : "NO");
		}
		
	}
}
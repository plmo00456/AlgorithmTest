import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str;
    	while((str = sc.next()) != null) {
    		if(str.equals("0")) break;
    		boolean chk = true;
    		for(int i=0; i<str.length()/2; i++) {
    			if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
    				chk = false;
    				break;
    			}
    		}
    		System.out.println(chk ? "yes" : "no");
    	}
    	
    }
}

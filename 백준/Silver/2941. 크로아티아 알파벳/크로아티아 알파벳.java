import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	String[] alp = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	while(true) {
    		int c = str.length();
    		for(int i=0; i<alp.length; i++)
    			str = str.replaceAll(alp[i], "1");
    		if(c == str.length()) break;
    	}
    	System.out.println(str.length());
    }
}
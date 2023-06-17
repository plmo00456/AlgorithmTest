import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	String str1 = str.substring(0,str.length()/2);
    	String str2 = "";
    	for(int i=str.length()-1; i>=str.length()/2 + str.length()%2; i--) {
    		str2 += str.charAt(i);
    	}
    	System.out.println(str.length()==1 ? "1" : str1.equals(str2) ? "1" : "0");
    }
}
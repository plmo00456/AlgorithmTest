import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i=0; i<str.length(); i++) {
    		char c = str.charAt(i);
    		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
    			char d = (char)(c+13);
    			if(((c >= 'a' && c <= 'z') && (d >= 'a' && d <= 'z')) || 
    					(c >= 'A' && c <= 'Z') && (d >= 'A' && d <= 'Z')) System.out.print(d);
    			else if(c >= 'a' && c <= 'z') System.out.print((char)('a' + (d - 'z' - 1)));
    			else if(c >= 'A' && c <= 'Z') System.out.print((char)('A' + (d - 'Z' - 1)));
    		}
    		else System.out.print(c);
    	}
    }
}

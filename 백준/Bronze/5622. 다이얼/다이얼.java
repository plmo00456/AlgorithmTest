import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static String[][] dial = {{}, {},{"A","B","C"}, {"D","E","F"}, {"G", "H", "I"}, {"J", "K", "L"}, {"M", "N", "O"}, {"P", "Q", "R", "S"}, {"T", "U", "V"}, {"W", "X", "Y", "Z"}};
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	
    	int ans = 0;
    	for(int s=0; s<str.length(); s++) {    		
    		for(int i=2; i<dial.length; i++) {
    			for(int j=0; j<dial[i].length; j++) {
    				if((str.charAt(s)+"").equals(dial[i][j])) {
    					ans += i + 1;
    				}
    			}
    		}
    		
    	}
    	
    	System.out.println(ans);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null) {
        	int[] ans = new int[4];
        	for(int i=0; i<str.length(); i++) {
        		char c = str.charAt(i);
        		if(c == ' ') ans[3]++;
        		else if(c <= '9') ans[2]++;
        		else if(c <= 'Z') ans[1]++;
        		else if(c <= 'z') ans[0]++;
        	}
        	System.out.println(String.format("%d %d %d %d", ans[0], ans[1],ans[2],ans[3]));
        }
    }
}

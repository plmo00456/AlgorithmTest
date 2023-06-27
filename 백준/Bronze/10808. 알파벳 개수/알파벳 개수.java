import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] al = new int[26];
        String str = br.readLine();
        for(int i=0; i<str.length(); i++) {
        	al[str.charAt(i)-'a']++;
        }
        for(int i : al) {
        	System.out.print(i + " ");
        }   
    }
}

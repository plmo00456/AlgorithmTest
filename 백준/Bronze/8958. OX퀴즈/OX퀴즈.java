import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Map<Character, Integer> map = new HashMap<>();
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for(int i=0; i<N; i++) {
    		String str = sc.next();
    		int cnt = 0;
    		int sum = 0;
    		for(int j=0; j<str.length(); j++) {
    			char c = str.charAt(j);
    			if(c == 'O') sum += ++cnt;
    			else cnt = 0;
    		}
    		System.out.println(sum);
    	}
    }
}

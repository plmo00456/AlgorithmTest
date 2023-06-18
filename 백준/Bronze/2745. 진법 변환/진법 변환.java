import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args){
		Map<String, Integer> map = new HashMap<>();
		mapInit(map);
		
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int B = sc.nextInt();
		int ans = 0;
		for(int i=1; i<=N.length(); i++) {
			int a = N.length()-i;
			ans += map.get(N.charAt(i-1)+"") * ((int)Math.pow(B, a));
		}
		
		System.out.println(ans);
	}
	
	public static void mapInit(Map<String, Integer> map) {
		int x = 10;
		for(int i=0; i<=9; i++) {
			map.put(i+"", i);
		}
		for(int i=65; i<65+26; i++) {
			map.put(((char)i)+"", x++);
		}
	}
}
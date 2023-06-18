import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args){
		Map<String, Integer> map = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		mapInit(map, map2);
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		String str = "";
		while(N >= B) {
			str += map2.get(N%B);
			N = N/B;
		}
		str += map2.get(N%B);
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static void mapInit(Map<String, Integer> map, Map<Integer, String> map2) {
		int x = 10;
		for(int i=0; i<=9; i++) {
			map.put(i+"", i);
		}
		for(int i=65; i<65+26; i++) {
			map.put(((char)i)+"", x++);
		}
		
		for(Entry<String, Integer> a : map.entrySet()) {
			map2.put(a.getValue(), a.getKey());
		}
		
	}
}
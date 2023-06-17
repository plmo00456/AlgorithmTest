import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Map<String, Integer> map = new HashMap<>();
    	
    	String str = sc.nextLine().toUpperCase(); 
    	for(int i=0; i<str.length(); i++) {
    		map.put(str.charAt(i)+"", map.getOrDefault(str.charAt(i)+"", 0) + 1);
    	}
    	
    	String[] sArr = new String[map.size()];
    	int[] cArr = new int[map.size()];
    	
    	int c = 0;
    	for(Entry<String, Integer> e : map.entrySet()) {
    		sArr[c] = e.getKey();
    		cArr[c] = e.getValue();
    		c++;
    	}
    	
    	for(int i=1; i<cArr.length; i++) {
    		for(int j=i; j>0; j--) {
    			if(cArr[j] > cArr[j-1]) {
    				int tmp = cArr[j];
    				cArr[j] = cArr[j-1];
    				cArr[j-1] = tmp;
    				String _tmp = sArr[j];
    				sArr[j] = sArr[j-1];
    				sArr[j-1] = _tmp;
    			}
    		}
    	}
    	
    	System.out.println(str.length() == 1 ? str : cArr[0] == cArr[1] ? "?" : sArr[0]);
    	
    }
}
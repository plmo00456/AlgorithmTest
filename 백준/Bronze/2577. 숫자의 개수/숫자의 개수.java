import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Map<Character, Integer> map = new HashMap<>();
    	Scanner sc = new Scanner(System.in);
    	String A = (sc.nextInt() * sc.nextInt() * sc.nextInt()) + "";
    	for(int i=0; i<A.length(); i++)
    		map.put(A.charAt(i), map.getOrDefault(A.charAt(i), 0)+1);
    	System.out.println(map.getOrDefault('0', 0));
    	System.out.println(map.getOrDefault('1', 0));
    	System.out.println(map.getOrDefault('2', 0));
    	System.out.println(map.getOrDefault('3', 0));
    	System.out.println(map.getOrDefault('4', 0));
    	System.out.println(map.getOrDefault('5', 0));
    	System.out.println(map.getOrDefault('6', 0));
    	System.out.println(map.getOrDefault('7', 0));
    	System.out.println(map.getOrDefault('8', 0));
    	System.out.println(map.getOrDefault('9', 0));
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Map<String, Double> score = new HashMap<>();
    	score.put("A+", 4.5);
    	score.put("A0", 4.0);
    	score.put("B+", 3.5);
    	score.put("B0", 3.0);
    	score.put("C+", 2.5);
    	score.put("C0", 2.0);
    	score.put("D+", 1.5);
    	score.put("D0", 1.0);
    	score.put("F", 0.0);
    	
    	Scanner sc = new Scanner(System.in);
    	float ans = 0;
    	float hakSum = 0;
    	for(int i=0; i<20; i++) {
    		sc.next();
    		float hak = sc.nextFloat();
    		String s = sc.next();
    		if(!s.equals("P")) {
    			ans += hak * score.get(s);
    			hakSum += hak;
    		}
    	}
    	System.out.println(ans/hakSum);
			
    }
}
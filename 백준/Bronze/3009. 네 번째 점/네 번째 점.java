import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> xMap = new HashMap<>();
		Map<Integer, Integer> yMap = new HashMap<>();
		for(int i=0; i<3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			xMap.put(x, xMap.getOrDefault(x, 0) + 1);
			yMap.put(y, yMap.getOrDefault(y, 0) + 1);
		}
		int x = 0;
		int y = 0;
		int xCnt = Integer.MAX_VALUE;
		int yCnt = Integer.MAX_VALUE;
		for(Entry<Integer, Integer> e : xMap.entrySet()) {
			if(e.getValue().equals(Math.min(e.getValue(), xCnt))) {
				x = e.getKey();
				xCnt = e.getValue();
			}
		}
		
		for(Entry<Integer, Integer> e : yMap.entrySet()) {
			if(e.getValue().equals(Math.min(e.getValue(), yCnt))) {
				y = e.getKey();
				yCnt = e.getValue();
			}
		}
		System.out.println(x + " " + y);
	}
}
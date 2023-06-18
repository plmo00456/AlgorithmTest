import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
	private static ArrayList<Integer> a = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cnt = Integer.parseInt(br.readLine());
			
			for(int i=0; i<cnt; i++) {
				int money = Integer.parseInt(br.readLine());
				Map<Integer, Integer> ans = new HashMap<Integer, Integer>();
				ans.put(1, 0);
				ans.put(5, 0);
				ans.put(10, 0);
				ans.put(25, 0);
				Stack<Integer> coins = new Stack<>();
				coins.add(1);
				coins.add(5);
				coins.add(10);
				coins.add(25);
				
				while(money > 0) {
					if(money >= coins.peek()) {
						ans.put(coins.peek(), ans.get(coins.peek())+1);
						money -= coins.peek();
					}else {
						coins.pop();
					}
				}
				System.out.println(ans.get(25) + " " + ans.get(10) + " " + ans.get(5) + " " + ans.get(1));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

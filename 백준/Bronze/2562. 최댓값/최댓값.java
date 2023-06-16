import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int max = 0;
			int num = 1;
			for(int i=1; i<10; i++) {
				int val = Integer.parseInt(br.readLine());
				if(val > max) {
					max = val;
					num = i;
				}
			}
			System.out.println(max);
			System.out.println(num);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
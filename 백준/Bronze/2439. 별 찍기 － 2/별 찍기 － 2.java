import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			for(int i=1; i<=n; i++) {
				for(int j=n; j>=1; j--) {
					if(i>=j)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println("");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
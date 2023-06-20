import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int cnt = 0;
			int ans = 0;
			for(int i=1; i<=n; i++) {
				if(n % i == 0) cnt++;
				if(cnt==m) {
					ans = i;
					break;
				}
			}
			System.out.println(m > cnt ? 0 : ans);
		}catch(Exception e) {}
	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int vals[] = new int[n];
			for(int i=0; i<n; i++)
				vals[i] = Integer.parseInt(st.nextToken());
			Arrays.sort(vals);
			System.out.println(vals[0] + " " + vals[vals.length-1]);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
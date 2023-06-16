import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int[] alp = new int[26];
			for(int i=0; i<alp.length; i++) alp[i] = -1;
			
			for(int i=0; i<str.length(); i++) {
				if(alp[(int)str.charAt(i) - 97] == -1) alp[(int)str.charAt(i) - 97] = i;
			}

			for(int i=0; i<alp.length; i++) System.out.print(alp[i] + " ");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
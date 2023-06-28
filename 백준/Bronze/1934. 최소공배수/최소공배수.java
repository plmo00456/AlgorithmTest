import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {        	
        	String str = br.readLine();
        	int A = Integer.parseInt(str.split(" ")[0]);
        	int B = Integer.parseInt(str.split(" ")[1]);
        	
        	int j = 1;
        	int ans1 = 0;
        	while(Math.max(A, B) > j) {
        		if(A % j == 0 && B % j == 0)
        			ans1 = j;
        		j++;
        	}
        	System.out.println(A==B ? A : (A*B)/ans1);
        }
    }
}

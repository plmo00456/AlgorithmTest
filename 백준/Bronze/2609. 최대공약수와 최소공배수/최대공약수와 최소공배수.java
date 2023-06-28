import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int A = Integer.parseInt(str.split(" ")[0]);
        int B = Integer.parseInt(str.split(" ")[1]);
        
        int i = 1;
        int ans1 = 0;
        while(Math.max(A, B) > i) {
        	if(A % i == 0 && B % i == 0)
        		ans1 = i;
        	i++;
        }
        System.out.println(A==B ? A : ans1);
        System.out.println(A==B ? A : (A*B)/ans1);
    }
}

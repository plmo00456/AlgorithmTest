
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger fac = new BigInteger("1");
        for(int i = 2; i<=N; i++)
        	fac = fac.multiply(new BigInteger(i+""));
        String str = fac+"";
        int ans = 0;
        for(int i=str.length()-1; i>=0; i--) {
        	if(str.charAt(i) == '0') ans++;
        	else break;
        }
        System.out.println(ans);
    }
}

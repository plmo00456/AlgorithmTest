import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) throws IOException {
//    	BufferedReader br = new BufferedReader(new FileReader("input.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		
		bw.append(fac(N, M) / fac(M, M-1) + "");
		
		bw.flush();
		bw.close();
		br.close();
    }
    
    public static int fac(int n, int m) {
    	int a = 1;
    	for(int i = n; i>n-m; i--) {
    		a *= i;
    	}
    	return a;
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int A = Integer.parseInt(str.split(" ")[0]);
		int B = Integer.parseInt(str.split(" ")[1]);
		if(A == 1) A = 2;
		if(A == 2) {
			bw.append("2\n");
			A = 3;
		}
		if(A % 2 == 0) A++;
		for(int i=A; i<=B; i+=2) {
			if(isPrime(i)) bw.append(i+"\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    
}
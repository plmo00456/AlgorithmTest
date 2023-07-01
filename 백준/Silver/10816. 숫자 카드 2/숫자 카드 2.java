import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
    public static void main(String[] args) throws IOException {
//    	BufferedReader br = new BufferedReader(new FileReader("input.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[] str1 = br.readLine().split(" ");
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i<N; i++) {
			String str = str1[i]; 
			map.put(str, map.getOrDefault(str, 0) + 1);
		}
		
		int M = Integer.parseInt(br.readLine());
		String[] str2 = br.readLine().split(" ");
		for(int i=0; i<M; i++) {
			String str = str2[i]; 
			bw.append(map.getOrDefault(str, 0)+" ");
		}
		bw.flush();
		bw.close();
		br.close();
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
    public static void main(String[] args) throws IOException {
//    	BufferedReader br = new BufferedReader(new FileReader("input.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<=N; i++) queue.add(i);
		
		bw.append("<");
		while(!queue.isEmpty()) {
			for(int i=1; i<M; i++) queue.add(queue.poll());
			bw.append(queue.size() == 1 ? queue.poll() + ">" :  queue.poll() + ", ");
		}
		
		bw.flush();
		bw.close();
		br.close();
    }
}

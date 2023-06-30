import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<>();
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i=1; i<=N; i++)
			set.add(Integer.parseInt(br.readLine()));
		
		for(int i : set)
			q.add(i);
		
		while(!q.isEmpty())
			bw.append(q.poll()+"\n");
		
		bw.flush();
		bw.close();
		br.close();
	}
}

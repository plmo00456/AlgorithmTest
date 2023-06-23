import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	String NK = br.readLine();
    	int N = Integer.parseInt(NK.split(" ")[0]);
    	int K = Integer.parseInt(NK.split(" ")[1]);
    	
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> ans = new LinkedList<>();
        for(int i=1; i<=N; i++) queue.add(i);
        int i = 1;
        while(!queue.isEmpty()) {
        	if(i == K) {
        		ans.add(queue.poll());
        		i = 1;
        	}else {
        		queue.add(queue.poll());
        		i++;
        	}
        }
    	bw.append(ans.toString().replace("[","<").replace("]",">"));
    	bw.flush();
    	bw.close();
    	br.close();
    }
}
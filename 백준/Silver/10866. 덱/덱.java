import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int N = Integer.parseInt(br.readLine());
    	Deque<Integer> deck = new LinkedList<>();
    	for(int i=0; i<N; i++) {
    		String str = br.readLine();
    		String cmd = str.split(" ")[0];
    		switch(cmd) {
    			case "push_front":
    				deck.addFirst(Integer.parseInt(str.split(" ")[1]));
    				break;
    			case "push_back":
    				deck.addLast(Integer.parseInt(str.split(" ")[1]));
    				break;
    			case "pop_front":
    				bw.append((deck.isEmpty() ? -1 : deck.pollFirst())+"\n");
    				break;
    			case "pop_back":
    				bw.append((deck.isEmpty() ? -1 : deck.pollLast())+"\n");
    				break;
    			case "size":
    				bw.append(deck.size()+"\n");
    				break;
    			case "empty":
    				bw.append((deck.isEmpty() ? 1 : 0)+"\n");
    				break;
    			case "front":
    				bw.append((deck.isEmpty() ? -1 : deck.peekFirst())+"\n");
    				break;
    			case "back":
    				bw.append((deck.isEmpty() ? -1 : deck.peekLast())+"\n");
    				break;
    		}
    	}
    	bw.flush();
    	bw.close();
    	br.close();
    }
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

class MyQueue{
	List<Integer> q = new ArrayList<>();
	
	public void push(int i) {
		q.add(i);
	}
	
	public int pop() {
		if(isEmpty() == 1) return -1;
		int i = q.get(0);
		q.remove(0);
		return i;
	}
	
	public int isEmpty() {
		return q.isEmpty() ? 1 : 0;
	}
	
	public int size() {
		return q.size();
	}
	
	public int front() {
		if(isEmpty() == 1) return -1;
		return q.get(0);
	}
	
	public int back() {
		if(isEmpty() == 1) return -1;
		return q.get(size() - 1);
	}
}

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int N = Integer.parseInt(br.readLine());
    	MyQueue queue = new MyQueue();
    	for(int i=0; i<N; i++) {
    		String str = br.readLine();
    		String cmd = str.split(" ")[0];
    		if(cmd.equals("push")) {
    			queue.push(Integer.parseInt(str.split(" ")[1]));
    		}else if(cmd.equals("front")) {
    			bw.append(queue.front()+"\n");
    		}else if(cmd.equals("back")) {
    			bw.append(queue.back()+"\n");
    		}else if(cmd.equals("size")) {
    			bw.append(queue.size()+"\n");
    		}else if(cmd.equals("empty")) {
    			bw.append(queue.isEmpty()+"\n");
    		}else if(cmd.equals("pop")) {
    			bw.append(queue.pop()+"\n");
    		}
    	}

    	bw.flush();
    	bw.close();
    	br.close();
    }
}
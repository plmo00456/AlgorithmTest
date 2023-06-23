import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder ori = new StringBuilder(br.readLine());
    	int N = Integer.parseInt(br.readLine());
    	
    	Stack<Character> stack = new Stack<>();
    	Stack<Character> stack2 = new Stack<>();
    	for(int i=0; i<ori.length(); i++)
    		stack.push(ori.charAt(i));
    	
    	for(int i=0; i<N; i++) {
    		String[] input = br.readLine().split(" ");
            char cmd = input[0].charAt(0);
    		if(cmd=='P') {
    			stack.add(input[1].charAt(0));
    		}else if(cmd=='D' && !stack2.isEmpty()) {
    			stack.add(stack2.pop());
    		}
    		if(!stack.isEmpty()) {
    			if(cmd=='L') {
    				stack2.add(stack.pop());
    			}else if(cmd=='B') {
    				stack.pop();
    			}
    		}
    	}
    	StringBuilder ans = new StringBuilder();
    	while(!stack.isEmpty()) {
    		stack2.add(stack.pop());
    	}
    	while(!stack2.isEmpty()) {
    		ans.append(stack2.pop());
    	}
    	bw.append(ans);
    	bw.flush();
    	bw.close();
    	br.close();
    }
}
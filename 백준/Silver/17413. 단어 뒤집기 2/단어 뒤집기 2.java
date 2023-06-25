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
    	
    	Stack<Character> stack = new Stack<>();
    	String str = br.readLine();
    	boolean isOpen = false;
    	StringBuilder openStr = new StringBuilder();
    	for(int i=0; i<str.length(); i++) {
    		char currentChar = str.charAt(i);
    		if(!isOpen) {
    			if(currentChar == '<') {    				
    				while(!stack.isEmpty()) {
    					bw.append(stack.pop());
    				}
    				isOpen = true;
    				bw.append(currentChar);
    			}else if(currentChar == ' ') {
    				while(!stack.isEmpty()) {
        				bw.append(stack.pop());
        			}
        			bw.append(' ');
    			}else {
    				stack.add(currentChar);
    			}
    		}else if(isOpen) {
    			if(currentChar == '>') {    				
    				isOpen = false;
    			}
    			bw.append(currentChar);
    		} else {    			
    			stack.add(currentChar);
    		}
    	}
    	while(!stack.isEmpty()) {
			bw.append(stack.pop());
		}
		bw.append(' ');
    	
    	bw.flush();
    	bw.close();
    	br.close();
    }
}
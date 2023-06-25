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
    	
    	String str = br.readLine();
    	Stack<Integer> stack = new Stack<>();
        int count = 0;
        char lastChar = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(1);
            } else if (c == ')') {
            	stack.pop();
            	if(lastChar == '(')
            		count += stack.size();
            	else
            		count++;
            }
            lastChar = c;
        }
        
    	bw.append(count+"");
    	bw.flush();
    	bw.close();
    	br.close();
    }
}
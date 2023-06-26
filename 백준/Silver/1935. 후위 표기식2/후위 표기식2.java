import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Stack<Double> stack = new Stack<>();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
        	char c = str.charAt(i);
        	switch(c) {
        		case '*':
        			if((stack.size() > 1))
        				stack.add(stack.pop() * stack.pop());
        			break;
        		case '/':
        			if((stack.size() > 1)) {
	        			double a = stack.pop();
	        			double b = stack.pop();
	        			stack.add(b / a);
        			}
        			break;
        		case '+':
        			if((stack.size() > 1))
        				stack.add(stack.pop() + stack.pop());
        			break;
        		case'-':
        			if((stack.size() > 1)) {
	        			double q = stack.pop();
	        			double w = stack.pop();
	        			stack.add(w - q);
        			}
        			break;
        		default:
        			if(map.get(c) == null) {
        				Integer val = Integer.parseInt(br.readLine());
        				stack.add((double)val);
        				map.put(c, val);
        			}else
        				stack.add((double)map.get(c));
        			break;
        	}
        }        
        bw.append(String.format("%.2f",stack.pop()));
        bw.flush();
        bw.close();
        br.close();
    }
}

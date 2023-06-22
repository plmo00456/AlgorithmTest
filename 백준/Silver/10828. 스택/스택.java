import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main { 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			str = st.nextToken();
			if(str.equals("push")) {
				int j = Integer.parseInt(st.nextToken());
				stack.add(j);
			}else if(str.equals("top")) {
				bw.append((stack.isEmpty() ? -1 : stack.peek())+"\n");
			}else if(str.equals("size")) {
				bw.append(stack.size()+"\n");
			}else if(str.equals("pop")) {
				bw.append((stack.isEmpty() ? -1 : stack.pop())+"\n");
			}else if(str.equals("empty")) {
				bw.append((stack.isEmpty() ? 1 : 0)+"\n");
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
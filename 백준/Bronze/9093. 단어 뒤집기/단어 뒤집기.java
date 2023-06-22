import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Stack<String> stack = new Stack<>();
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			while(st.hasMoreTokens()) {
				str = st.nextToken();
				for(int j=0; j<str.length(); j++) {
					stack.add(str.charAt(j) + "");
				}
				for(int j=0; j<str.length(); j++) {
					bw.append(stack.pop());
				}
				if(st.hasMoreTokens())
					bw.append(" ");
			}
			if(i != N-1)
				bw.append("\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0 && !stack.isEmpty()) stack.pop();
            else if(num != 0) stack.add(num);
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        bw.append(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
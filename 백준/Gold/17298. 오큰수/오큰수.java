import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] A = new int[N];
        int[] result = new int[N];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(str[i]);
            result[i] = -1;
        }

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                int idx = stack.pop();
                result[idx] = A[i];
            }
            stack.push(i);
        }

        for (int i = 0; i < N; i++) {
            bw.write(String.valueOf(result[i]));
            if (i != N - 1) {
                bw.write(" ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

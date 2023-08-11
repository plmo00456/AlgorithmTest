import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> p = new PriorityQueue<>();

        int[] A = new int[N];

        String[] As = br.readLine().split(" ");
        String[] Bs = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(As[i]);
            p.add(Integer.parseInt(Bs[i]));
        }

        Arrays.sort(A);

        int sum = 0;
        for (int i = N-1; i >= 0; i--) {
            sum += A[i] * p.poll();
        }

        bw.append(sum+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
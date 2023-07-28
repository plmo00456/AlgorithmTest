import java.io.*;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
            return o2-o1;
        });

        for(int i=0; i<N; i++){
            int A = Integer.parseInt(br.readLine());
            if(A == 0) bw.append((q.isEmpty() ? "0" : q.poll()) + "\n");
            else q.add(A);
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
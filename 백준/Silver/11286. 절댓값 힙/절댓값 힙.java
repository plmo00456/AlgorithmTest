import java.io.*;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
            if (Math.abs(o1) == Math.abs(o2)) {
                return Integer.compare(o1, o2);
            } else {
                return Integer.compare(Math.abs(o1), Math.abs(o2));
            }
        });
        for(int i=0; i<N; i++){
            int A = Integer.parseInt(br.readLine());

            if(A == 0)
                bw.append(q.size() == 0 ? "0\n" : q.poll()+"\n");
            else
                q.add(A);
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
import java.io.*;
import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(str.equals("0")){
                bw.append(q.isEmpty() ? "0" : q.poll()+"").append("\n");
            }else{
                q.add(Integer.parseInt(str));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

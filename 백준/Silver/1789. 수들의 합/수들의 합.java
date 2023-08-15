import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());

        long sum = 0;
        long cnt = 0;
        for(long i=1; i<=N; i++){
            if(sum > N) break;
            sum += i;
            cnt++;
        }
        bw.append((cnt == 0 ? 0 : cnt == 1 ? 1 : cnt - 1) + "\n");

        br.close();
        bw.flush();
        bw.close();

    }
}

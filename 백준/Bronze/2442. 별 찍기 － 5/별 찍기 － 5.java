import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++) {
            for(int j = i; j < N; j++) {
                bw.append(" ");
            }
            for(int k = 0; k < i*2-1; k++) {
                bw.append("*");
            }
            bw.append("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

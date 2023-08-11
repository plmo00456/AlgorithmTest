import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                bw.append(" ");
            }
            for (int k = 0; k < (2 * N - 1) - (2 * i); k++) {
                bw.append("*");
            }
            bw.append("\n");
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = 1; j < (N - 1) - i; j++) {
                bw.append(" ");
            }
            for (int k = 0; k < 3 + 2 * i; k++) {
                bw.append("*");
            }
            bw.append("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
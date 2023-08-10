import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        A = Math.min(A, Integer.parseInt(br.readLine()));
        A = Math.min(A, Integer.parseInt(br.readLine()));

        int B = Integer.parseInt(br.readLine());
        B = Math.min(B, Integer.parseInt(br.readLine()));

        bw.append(A+B-50+"");
        br.close();
        bw.flush();
        bw.close();
    }
}

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long sum = 0;
        for (int i = 0; i < N; i++) {
            int c = str.charAt(i) - 96;
            sum += c * Math.pow(31, i);
        }
        bw.append(sum % 1234567891 + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
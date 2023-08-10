import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str[] = br.readLine().split(" ");
        int R = Integer.parseInt(str[0]);
        int S = Integer.parseInt(str[1]);
        bw.append(S*2 - R + "");

        br.close();
        bw.flush();
        bw.close();
    }
}

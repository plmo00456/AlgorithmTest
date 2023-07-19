import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader br = new BufferedReader(new FileReader("output.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();
        String tar = "I" + "OI".repeat(N);
        int cnt = 0;
        int currentIndex = 0;

        while ((currentIndex = S.indexOf(tar, currentIndex)) != -1) {
            cnt++;
            currentIndex += 1;
        }

        bw.append(cnt+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();
        String tar = "I" + "OI".repeat(N);
        int cnt = 0;
        for(int i=0; i<=M-tar.length(); i++){
            String a = S.substring(i, i + tar.length());
            if(tar.equals(a)) cnt++;
        }
        bw.append(cnt+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
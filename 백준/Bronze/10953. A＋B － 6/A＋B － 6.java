import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str[] = br.readLine().split(",");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            bw.append(a + b + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

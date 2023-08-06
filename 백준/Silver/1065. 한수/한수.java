import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cnt = N > 99 ? 99 : N;

        for(int i = 100; i<=N; i++){
            boolean chk = true;
            String a = i+"";
            int val = Integer.parseInt(a.charAt(1)+"") - Integer.parseInt(a.charAt(0)+"");
            for(int j=1; j < a.length(); j++){
                int A = Integer.parseInt(a.charAt(j)+"");
                int B = Integer.parseInt(a.charAt(j-1)+"");
                if(A - B != val) {
                    chk = false;
                    break;
                }
            }
            if(chk) cnt++;
        }

        bw.append(cnt+"");

        bw.flush();
        bw.close();
        br.close();
    }
}

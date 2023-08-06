import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(str[2]);

        if(C - B < 1) bw.append(-1+"");
        else{
            bw.append((A / (C-B)) + 1+"");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

import java.io.*;
import java.math.BigInteger;

public class Main {

    static BigInteger[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int pisano = 1500000;
        long size = Long.parseLong(br.readLine()) % pisano;

        long[] num = new long[pisano + 1];
        num[0] = 0;
        num[1] = 1;

        for(int i = 2; i <= pisano; i++) {
            num[i] = (num[i - 1] + num[i - 2]) % 1000000;
        }
        bw.append(num[(int)size]+"");

        br.close();
        bw.flush();
        bw.close();
    }
}

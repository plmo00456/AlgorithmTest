import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < N; i++) {
            int c = str.charAt(i) - 96;
            BigInteger bi = new BigInteger(String.valueOf(c)).multiply(new BigInteger(String.valueOf((int) Math.pow(31, i))));
            sum = sum.add(bi);
        }
        bw.append(String.valueOf(sum.mod(BigInteger.valueOf(1234567891L))));

        bw.flush();
        bw.close();
        br.close();
    }
}
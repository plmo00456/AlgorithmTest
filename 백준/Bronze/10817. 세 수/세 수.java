import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(str[2]);

        List<Integer> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);

        list.sort(null);
        bw.append(list.get(1)+"");

        bw.flush();
        bw.close();
        br.close();
    }
}

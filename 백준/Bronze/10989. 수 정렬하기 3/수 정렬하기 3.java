import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] ans = new int[N];

        for(int i=0; i<ans.length; i++)
            ans[i] = Integer.parseInt(br.readLine());

        Arrays.sort(ans);
        for(int i : ans)
            bw.append(i+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
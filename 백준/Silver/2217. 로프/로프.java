import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        for(int i=0; i<N; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, min * (i+1));
        }
        bw.append(max+"");

        br.close();
        bw.flush();
        bw.close();
    }
}

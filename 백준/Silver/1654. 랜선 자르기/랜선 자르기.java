import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] KN = br.readLine().split(" ");
        int K = Integer.parseInt(KN[0]);
        int N = Integer.parseInt(KN[1]);

        int max = 0;
        int[] lines = new int[K];
        for (int i = 0; i < K; i++) {
            lines[i] = Integer.parseInt(br.readLine());
            max = Math.max(lines[i], max);
        }

        long st = 1;
        long ed = max;
        long mid;
        long sum;
        while (st <= ed) {
            mid = (st + ed) / 2;
            sum = 0;
            for (int i = 0; i < K; i++) {
        		sum += lines[i] / mid;
            }
            if (sum < N) {
                ed = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        System.out.println(ed);
    }
}

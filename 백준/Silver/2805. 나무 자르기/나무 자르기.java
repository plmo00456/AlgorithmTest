import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        long tar = Long.parseLong(NM[1]);

        long[] arr = new long[N];
        long st = 1;
        long ed = Long.MIN_VALUE;
        String num[] = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(num[i]);
            ed = Math.max(ed, arr[i]);
        }

        long val = Long.MAX_VALUE;
        long tmp = 0;
        while (st <= ed) {
            long mid = (st + ed) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += Math.max(arr[i] - mid, 0);
            }
            if (sum > tar) {
                st = mid + 1;
                if (val > Math.abs(sum - tar)) {
                    val = Math.abs(sum - tar);
                    tmp = mid;
                }
            } else if (sum < tar) {
                ed = mid - 1;
            } else {
                tmp = mid;
                break;
            }
        }

        System.out.println(tmp);
        br.close();
    }
}

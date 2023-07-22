import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] nums = br.readLine().split(" ");
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(nums[i]);
            arr[i] = num;
        }

        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        int num = 0;
        for(int i=0; i<N; i++){
            boolean chk = map.getOrDefault(arr2[i], -1) == -1;
            if(chk)
                map.put(arr2[i], num++);
        }

        for(int i=0; i<N; i++){
            bw.append(map.get(arr[i]) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

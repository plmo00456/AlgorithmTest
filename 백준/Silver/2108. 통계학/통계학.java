import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        double[] nums = new double[N];
        int maxVal = 0;
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            nums[i] = num;
            map.put(num, map.getOrDefault(num, 0) + 1);
            maxVal = Math.max(maxVal, map.get(num));
        }

        Arrays.sort(nums);

        double sum = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int lastVal = 0;
        int twoVal = 0;
        for(int i=0; i<N; i++){
            int num = (int)nums[i];
            sum += nums[i];
            if(maxVal == map.get(num)){
                if(q.isEmpty()){
                    lastVal = num;
                    q.add(num);
                }else{
                    if(lastVal != num){
                        if(q.size() == 1)
                            twoVal = num;
                        lastVal = num;
                        q.add(num);
                    }
                }
            }
        }

        bw.append(Integer.parseInt(String.format("%.0f", sum / N))+"\n");
        bw.append(String.format("%.0f", nums[nums.length / 2])).append("\n");
        if(N == 1){
            bw.append(String.format("%.0f", nums[0])).append("\n");
        }else{
            if(maxVal == 1){
                bw.append(String.format("%d", twoVal)).append("\n");
            }else if(q.size() > 1){
                bw.append(String.format("%d", twoVal)).append("\n");
            }else{
                bw.append(String.format("%d", q.poll())).append("\n");
            }
        }
        bw.append(String.format("%.0f", Math.abs(nums[nums.length - 1] - nums[0]))).append("\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
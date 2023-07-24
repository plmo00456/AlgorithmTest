import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        if(T == 0) bw.append("0");
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;
            Map<String, Integer> map = new HashMap<>();
            for(int j=0; j<N; j++){
                String[] str = br.readLine().split(" ");
                String type = str[1];
                map.put(type, map.getOrDefault(type, 0) + 1);
            }

            int vals = 0;
            for(Map.Entry<String, Integer> e : map.entrySet()){
                if(vals == 0) vals = (e.getValue() + 1);
                else vals *= (e.getValue() + 1);
            }
            cnt += vals -1;
            bw.append((N == 0 ? 0 : cnt) +"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
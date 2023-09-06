import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0; i<N; i++){
            String str = br.readLine();
            if(str.equals("ENTER")){
                map = new HashMap<>();
            }else{
                int val = map.getOrDefault(str, 0);
                if(val == 0) {
                    map.put(str, val + 1);
                    ans++;
                }
            }
        }

        bw.append(ans+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NM = br.readLine().split(" ");

        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        for(int i=0; i<N; i++){
            String str = br.readLine();
            map.put(str, 1);
        }

        for(int i=0; i<M; i++){
            String str = br.readLine();
            if(map.getOrDefault(str, 0).equals(1)) ans.add(str);
        }

        ans.sort(null);
        bw.append(ans.size()+"\n");
        for(String a : ans){
            bw.append(a+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

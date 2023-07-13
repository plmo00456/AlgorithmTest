import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NM = br.readLine().split(" ");

        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        for(int i=1; i<=N; i++){
            String name = br.readLine();
            map1.put(i, name);
            map2.put(name, i);
        }
        for(int i=0; i<M; i++){
            String tar = br.readLine();
            bw.append((map2.get(tar) == null ? map1.get(Integer.parseInt(tar)) : map2.get(tar)) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

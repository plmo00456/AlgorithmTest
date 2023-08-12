import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String NS[] = br.readLine().split(" ");
        int AR[] = new int[N];
        int M = Integer.parseInt(br.readLine());
        String MS[] = br.readLine().split(" ");
        int BR[] = new int[M];
        Map<Integer, Boolean> map = new HashMap<>();
        for(int i=0; i<N; i++){
            AR[i] = Integer.parseInt(NS[i]);
            map.put(AR[i], true);
        }
        for(int i=0; i<M; i++){
            BR[i] = Integer.parseInt(MS[i]);
            bw.append(map.getOrDefault(BR[i], false) ? "1" : "0").append(" ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

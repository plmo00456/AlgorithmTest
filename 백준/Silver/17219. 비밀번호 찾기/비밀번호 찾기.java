import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        Map<String, String> map = new HashMap<>();
        for(int i=0; i<N; i++){
            String[] line = br.readLine().split(" ");
            map.put(line[0], line[1]);
        }
        for(int i=0; i<M; i++){
            bw.append(map.get(br.readLine())).append("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

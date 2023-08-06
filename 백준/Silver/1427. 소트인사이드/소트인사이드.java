import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        String[] str = br.readLine().split("");
        for(int i=0; i<str.length; i++){
            list.add(Integer.parseInt(str[i]));
        }

        list.sort((o1, o2) -> o2 - o1);

        bw.append(list.toString().replace("[","").replace("]","").replace(", ", ""));

        bw.flush();
        bw.close();
        br.close();
    }
}

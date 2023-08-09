import java.io.*;

public class Main {

    static String[] WEEK = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    static int[] Date = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] date = br.readLine().split(" ");
        int m = Integer.parseInt(date[0]);
        int d = Integer.parseInt(date[1]);

        int D = 0;
        for(int i=0; i<m; i++){
            D += Date[i];
        }
        D += d;
        bw.append(WEEK[D%7]+"");

        br.close();
        bw.flush();
        bw.close();
    }
}

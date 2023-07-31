import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int d = Integer.parseInt(str[3]);
        int e = Integer.parseInt(str[4]);
        int f = Integer.parseInt(str[5]);

        for(int i=-999; i<=999; i++){
            for(int j=-999; j<=999; j++){
                if(a * i + b * j == c && d * i + e * j == f)
                    bw.append(i + " " + j);
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }

}
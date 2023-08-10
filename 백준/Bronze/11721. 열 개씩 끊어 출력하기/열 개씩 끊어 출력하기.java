import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        for(int i=0; i<str.length(); i+=10){
            bw.append(str.substring(i, i+10 > str.length() ? str.length() : i+10)).append("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

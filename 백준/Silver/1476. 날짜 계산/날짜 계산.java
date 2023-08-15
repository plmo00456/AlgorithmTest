import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int E = 1;
        int S = 1;
        int M = 1;

        int cnt = 1;
        while(true){
            if((E+" "+S+" "+M).equals(str)) break;
            E++;
            S++;
            M++;
            cnt++;
            if(E>15) E = 1;
            if(S>28) S = 1;
            if(M>19) M = 1;
        }
        bw.append(cnt+"\n");

        br.close();
        bw.flush();
        bw.close();

    }
}

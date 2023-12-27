import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] map = new String[8];
        int sum = 0;
        for(int i=0; i<8; i++){
            map[i] = br.readLine();
        }
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(((i%2 == 0 && j%2==0) || (i%2 == 1 && j%2==1)) && map[i].charAt(j) == 'F'){
                    sum++;
                }
            }
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}

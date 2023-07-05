import java.io.*;

class Per{
    public int x;
    public int y;
    public Per(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Per[] person = new Per[N];
        for(int i=0; i<N; i++){
            String[] str = br.readLine().split(" ");
            person[i] = new Per(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
        }

        for(int i=0; i<N; i++){
            int rank = 0;
            for(int j=0; j<N; j++){
                if(person[i].x < person[j].x && person[i].y < person[j].y)
                    rank++;
            }
            bw.append((rank+1)+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
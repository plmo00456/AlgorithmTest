import java.io.*;

public class Main {

    static int A;
    static int B;
    static long ans = Long.MAX_VALUE;

    public static void dfs(long x, long cnt){
        if(x == B){
            ans = Math.min(ans, cnt);
            return;
        }else if(x > B){
            return;
        }

        dfs(x*2, cnt+1);
        dfs(Long.parseLong(x+"1"), cnt+1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String AB[] = br.readLine().split(" ");
        A = Integer.parseInt(AB[0]);
        B = Integer.parseInt(AB[1]);

        dfs(A, 1);

        bw.append((ans == Long.MAX_VALUE ? -1 : ans) +"");
        bw.flush();
        bw.close();
        br.close();
    }
}
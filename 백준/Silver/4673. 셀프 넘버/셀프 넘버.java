import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] dp = new int[10000+1];
        for(int i=1; i<=10000; i++){
            String a = i+"";
            if(a.length() == 1){
                int A = Integer.parseInt(a);
                dp[A*2] = 1;
            }else{
                int sum = 0;
                for(int j=0; j<a.length(); j++){
                    sum += Integer.parseInt(a.charAt(j)+"");
                }
                if(sum + i < 10001)
                    dp[sum + i] = 1;
            }
        }

        for(int i=1; i<=10000; i++){
            if(dp[i] == 0)
                bw.append(i+"\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}

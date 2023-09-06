import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] strs = new String[N];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            strs[i] = str;
        }
        String ans = "";
        for(int i = 0; i<strs[0].length(); i++){
            String tmp = "";
            boolean chk = true;
            for(int j=0; j<N; j++){
                 if(tmp.equals("")) tmp = strs[j].charAt(i)+"";
                 else{
                     if(!tmp.equals(strs[j].charAt(i)+"")){
                         chk = false;
                         break;
                     }
                 }
            }
            if(!chk) ans += "?";
            else ans += strs[0].charAt(i)+"";
        }

        bw.append(ans+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
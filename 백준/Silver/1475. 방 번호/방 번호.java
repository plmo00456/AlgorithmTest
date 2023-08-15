import java.io.*;

public class Main {
    static String card = "0123456789";
    public static int cnt = 1;

    public static void add(String n){
        card += "0123456789".replaceFirst(n, "");
        cnt++;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nums = br.readLine();
        for(int i=0; i<nums.length(); i++){
            String n = nums.charAt(i)+"";
            if(card.contains(n)){
                card = card.replaceFirst(n, "");
            }else{
                if(n.equals("6") && card.contains("9")){
                    card = card.replaceFirst("9", "");
                }else if(n.equals("9") && card.contains("6")){
                    card = card.replaceFirst("6", "");
                }else{
                    add(n);
                }
            }
        }
        bw.append(cnt+"");

        br.close();
        bw.flush();
        bw.close();

    }
}

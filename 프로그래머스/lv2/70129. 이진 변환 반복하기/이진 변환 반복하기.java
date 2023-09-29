import java.math.BigInteger;

class Solution {
    
    int transCnt = 0;
    int zeroCnt = 0;
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")){
            transCnt++;
            s = delZero(s);
            s = decToBin(s);
        }
        answer[0] = transCnt;
        answer[1] = zeroCnt;
        return answer;
    }
    
    public String delZero(String str){
        int A = str.length();
        str = str.replace("0", "");
        int B = str.length();
        zeroCnt += A - B;
        return str;
    }
    
    public String decToBin(String A){
        String binStr = "";
        int a = A.length();
        while(a > 0){
            if(a % 2 == 0){
                binStr += "0";
            }else{
                binStr += "1";
            }
            a /= 2;
        }
        String ret = "";
        for(int i=binStr.length() -1 ; i>=0; i--){
            ret += binStr.charAt(i)+"";
        }

        return ret;
    }
}
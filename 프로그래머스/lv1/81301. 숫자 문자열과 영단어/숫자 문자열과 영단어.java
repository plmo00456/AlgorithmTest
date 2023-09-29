class Solution {
    public int solution(String s) {
        String[] strNumber = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String _s = "one4seveneight";
        
        String tmp = "";
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            try{
                int intNumber = Integer.parseInt(s.charAt(i)+"");
                answer += intNumber;
                continue;
            }catch(Exception e){}
            
            tmp += s.charAt(i);
            if(tmp.length() > 2){
                for(int j=0; j<strNumber.length; j++){
                    if(tmp.equals(strNumber[j])){
                        answer += j;
                        tmp = "";
                    }
                }
            }
        }
        
        return Integer.parseInt(answer);
    }
}
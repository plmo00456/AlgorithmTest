class Solution {
    public int solution(String s) {
        int answer = s.length() == 1 ? 1 : Integer.MAX_VALUE;
        for(int i=1; i <= s.length() / 2; i++){
            answer = Math.min(answer, get(s, i));
        }
        return answer;
    }

    public int get(String s, int len){
        String tmp = s.substring(0, len);
        String ret = "";
        int cnt = 1;
        for(int i=len; i<s.length(); i += len){
            int val = i+len > s.length() ? s.length() : i+len;
            if(tmp.equals(s.substring(i, val))){
                cnt++;
            }else{
                ret += cnt > 1 ? cnt + tmp : tmp;
                tmp = s.substring(i, val);
                cnt = 1;
            }
        }
        ret += cnt == 1 ? tmp : cnt + tmp;
        return ret.length();
    }
}
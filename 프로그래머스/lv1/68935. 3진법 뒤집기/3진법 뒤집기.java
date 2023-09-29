class Solution {
    public int solution(int n) {
        String three = convertJinsu(n, 3);
        int sum = 0, j=1;
        for(int i=three.length()-1; i>=0; i--){
            int tc = Integer.parseInt(three.charAt(i)+"");
            sum += tc * j;
            j *= 3;
        }
        return sum;
    }
    
    //10진법 -> x진법
    //앞뒤 반전 하여 출력
    public String convertJinsu(int i, int cj){
        String ret = "";
        while(true){
            if(i < cj) break;
            ret += i % cj;
            i = i/cj;
        }
        ret += i;
        return ret;
    }
}
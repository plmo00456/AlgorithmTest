class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int A = 0;
        int B = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') A++;
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') B++;
        }

        return A == B;
    }
}
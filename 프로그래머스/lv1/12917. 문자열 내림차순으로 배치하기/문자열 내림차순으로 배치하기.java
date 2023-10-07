import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int[] arr = new int[s.length()];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)s.charAt(i);
        }
        Arrays.sort(arr);

        String str = "";
        for(int i = arr.length - 1; i>=0; i--){
            str += (char)arr[i];
        }
        return str;
    }
}
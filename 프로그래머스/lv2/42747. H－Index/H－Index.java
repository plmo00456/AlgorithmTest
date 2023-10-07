import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for(int h = citations.length; h>=1; h--){
            if(get(citations, h))
                return h;
        }
        return 0;
    }

    public boolean get(int[] arr, int h){
        int index = arr.length - h;
        return arr[index] >= h;
    }

}
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> _answer = new ArrayList<Integer>();
        List<Integer> rv = new ArrayList<Integer>();
        int[] answer = {};
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int a = numbers[i] + numbers[j];
                if(_answer.indexOf(a) < 0){
                    _answer.add(a);
                }
            }
        }
        answer = new int[_answer.size()];
        for(int i=0; i<_answer.size(); i++){
            answer[i] = _answer.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
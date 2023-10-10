import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer = Arrays.stream(numbers)
                .mapToObj(number -> String.valueOf(number))
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .reduce("", (s1, s2) -> s1.equals("0") ? s2 : s1 + s2);
        return answer;
    }
}
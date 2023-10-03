import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<Character, Integer> map = new HashMap<>();
    Map<Integer, Character> map2 = new HashMap<>();
    String ret = "";
    public int solution(String word) {
        map.put('A', 1);
        map.put('E', 2);
        map.put('I', 3);
        map.put('O', 4);
        map.put('U', 5);
        map2.put(1, 'A');
        map2.put(2, 'E');
        map2.put(3, 'I');
        map2.put(4, 'O');
        map2.put(5, 'U');

        int answer = 0;
        ret = word;
        answer = get();
        return answer;
    }

    public int get(){
        int i = 1;
        String tmp = "A";
        while(true){
            if(tmp.equals(ret)) return i;
            if(tmp.length() == 5){
                char last = tmp.charAt(4);
                int lastNum = map.get(last);
                if(lastNum == 5){
                    String tmp2 = "";
                    boolean chk = false;
                    for(int j = tmp.length() - 1; j >= 0; j--){
                        if(chk){
                            tmp2 += tmp.charAt(j);
                        }else{
                            if(map.get(tmp.charAt(j)) != 5){
                                tmp2 += map2.get(map.get(tmp.charAt(j)) + 1);
                                chk = true;
                            }
                        }
                    }
                    tmp = "";
                    for(int j=tmp2.length() - 1; j >= 0; j--){
                        tmp += tmp2.charAt(j);
                    }
                }else{
                    tmp = tmp.substring(0, 4) + map2.get(lastNum + 1);
                }
            }else{
                tmp += map2.get(1);
            }
//            System.out.println((i+1) + " : " + tmp);
            i++;
        }
    }
}
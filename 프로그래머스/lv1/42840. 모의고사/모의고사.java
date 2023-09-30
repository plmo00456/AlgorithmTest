import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int ac = 0, bc = 0, cc = 0;
        for(int i=0; i< answers.length; i++){
            if(answers[i] == a[i%a.length]) ac++;
            if(answers[i] == b[i%b.length]) bc++;
            if(answers[i] == c[i%c.length]) cc++;
        }
        
        int[] t = new int[3];
        t[0] = ac;
        t[1] = bc;
        t[2] = cc;
        
        Arrays.sort(t);
        
        if(t[2] == ac) ans.add(1);
        if(t[2] == bc) ans.add(2);
        if(t[2] == cc) ans.add(3);
        
        int[] answer = new int[ans.size()]; 
        for(int i=0; i<ans.size(); i++){
            answer[i] = ans.get(i);
        }
        
        System.out.println(ac);
        System.out.println(bc);
        System.out.println(cc);
        
        return answer;
    }
}
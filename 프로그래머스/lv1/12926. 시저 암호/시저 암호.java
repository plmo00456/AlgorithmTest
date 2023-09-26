import java.util.*;

class Solution {
    public String solution(String s, int n) {
        try{
            String[] al = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            int _n = n%al.length;
            String ret = "";
            for(int i=0; i<s.length(); i++){
                String c = s.charAt(i)+"";
                if(arrayContains(al, c) > -1){
                    if(arrayContains(al, c)+_n > al.length-1)
                        ret += al[(arrayContains(al, c)+_n)-al.length];
                    else
                        ret += al[arrayContains(al, c)+_n];
                }else if(arrayContains(al, c.toLowerCase()) > -1){
                    if(arrayContains(al, c.toLowerCase())+_n > al.length-1)
                        ret += al[(arrayContains(al, c.toLowerCase())+_n)-al.length].toUpperCase();
                    else
                        ret += al[arrayContains(al, c.toLowerCase())+_n].toUpperCase();
                }else{
                    ret += c;
                }
            }
            return ret;
        }catch(Exception e){
            return s;
        }
    }
    
    public int arrayContains(String[] al, String c){
        for(int i=0; i<al.length; i++){
            if(al[i].equals(c))
                return i;
        }
        return -1;
    }
}
class Solution {
    public String solution(String new_id) {
        String answer = trnasId(new_id, 1);
        return answer;
    }
    
    public String trnasId(String id, int grade){
        switch(grade){
            case 1:
                id = id.toLowerCase();
            case 2:
                String tmp = "";
                for(int i=0; i<id.length(); i++){
                    if(validationIdChk(id.charAt(i))) tmp += id.charAt(i);
                }
                id = tmp;
            case 3:
                while(id.contains(".."))
                    id = id.replace("..", ".");
            case 4:
                if(!id.equals("") && id.substring(0,1).equals("."))
                    id = id.substring(1);
                if(!id.equals("") && id.substring(id.length()-1).equals("."))
                    id = id.substring(0, id.length() -1);
            case 5:
                if(id.equals("")) id = "a";
            case 6:
                if(id.length() >= 16)
                    id = id.substring(0, 15);
                if(id.substring(id.length()-1).equals("."))
                    id = id.substring(0, id.length() -1);
            case 7:
                String tmp2 = "";
                if(id.length() <= 2){
                    if(id.length() == 1) tmp2 = id;
                    else if(id.length() == 2) tmp2 = id.substring(1);
                    
                    id += tmp2.repeat(3 - id.length());
                }
        }
        
        return id;
    }
    
    public boolean validationIdChk(char idc){
        if(idc == '-') return true;
        if(idc == '_') return true;
        if(idc == '.') return true;
        if(idc >= 48 && idc <= 57) return true;
        if(idc >= 97 && idc <= 122) return true;
        if(idc >= 65 && idc <= 90) return true;
        return false;
    }
}
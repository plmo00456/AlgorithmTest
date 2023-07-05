import java.io.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();

        String str;
        while(!(str = br.readLine()).equals(".")){
            stack.clear();
            boolean chk = true;

            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if(c == '(' || c == '[' || c == ')' || c == ']'){
                    if(c == '(' || c == '[')
                        stack.add(c);
                    else{
                        try{
                            if(stack.isEmpty()) throw new Exception("0");

                            if((stack.peek() == '(' && c == ')') || (stack.peek() == '[' && c == ']') || (stack.peek() == ')' || stack.peek() == ']'))
                                stack.pop();
                            else{
                                throw new Exception("0");
                            }
                        }catch (Exception e){
                            chk = false;
                            break;
                        }
                    }
                }
            }
            if(!stack.isEmpty()) chk = false;
            bw.append(chk? "yes" : "no").append("\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
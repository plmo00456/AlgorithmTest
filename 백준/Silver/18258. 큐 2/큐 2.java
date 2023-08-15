import java.io.*;
import java.util.LinkedList;

class Q{
    LinkedList<Integer> q = new LinkedList<>();
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public void push(int x){
        q.add(x);
    }

    public int pop(){
        return empty() == 1 ? -1 : q.poll();
    }

    public int size(){
        return q.size();
    }

    public int back(){
        if(empty() == 1){
            return -1;
        }else{
            return q.peekLast();
        }
    }

    public int front(){
        return empty() == 1 ? -1 : q.peek();
    }

    public int empty(){
        return q.isEmpty() ? 1 : 0;
    }

    public void controller(String cont, int x) throws IOException {
        switch (cont){
            case "push":
                push(x);
                break;
            case "pop":
                bw.append(pop()+"\n");
                break;
            case "size":
                bw.append(size()+"\n");
                break;
            case "empty":
                bw.append(empty()+"\n");
                break;
            case "front":
                bw.append(front()+"\n");
                break;
            case "back":
                bw.append(back()+"\n");
                break;
        }
    }

    public void run() throws IOException {
        bw.flush();
        bw.close();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Q q = new Q();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String str = br.readLine();
            String a = "";
            int x = -1;
            if(str.contains(" ")){
                a = str.split(" ")[0];
                x = Integer.parseInt(str.split(" ")[1]);
            }else{
                a = str;
            }
            q.controller(a, x);
        }
        q.run();
        br.close();
    }
}

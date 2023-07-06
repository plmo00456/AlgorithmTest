import java.io.*;
import java.util.*;

class Ranks {
    private int num;
    private int cnt;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public Ranks(int num, int cnt) {
        this.num = num;
        this.cnt = cnt;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            String[] str2 = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            Queue<Integer> q = new LinkedList<>();
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < A; j++) {
                int num = Integer.parseInt(str2[j]);
                q.add(num);
                set.add(num);
            }
            set.stream().sorted(Comparator.comparingInt(s -> s));
            List<Integer> list = new ArrayList<>(set);
            int cnt = 0;
            int currentIdx = B;
            while (!q.isEmpty()) {
                if(q.contains(list.get(list.size() - 1))){
                    if(list.get(list.size() - 1).equals(q.peek())){
                        cnt++;
                        q.poll();
                        if(currentIdx != 0) currentIdx--;
                        else break;
                    }else{
                        q.add(q.poll());
                        currentIdx -= 1;
                        if (currentIdx == -1) currentIdx = q.size() - 1;
                    }
                }else{
                    list.remove(list.size() - 1);
                }
            }
            bw.append(cnt+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
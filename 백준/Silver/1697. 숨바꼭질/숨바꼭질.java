import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int[] map;
    static boolean[] visited;

    static int[] cx = {0, -1, 1};

    static int K;

    public static void bfs(int x){
        Queue<Integer> q = new LinkedList<>();
        visited[x] = true;
        q.add(x);

        while(!q.isEmpty()){
            int _x = q.poll();
            for(int i=0; i<3; i++){
                int tmp = _x + cx[i];
                if(i == 0) tmp = _x*2;
                if(tmp >= 0 && tmp < map.length && !visited[tmp]){
                    q.add(tmp);
                    visited[tmp] = true;
                    map[tmp] += map[_x] + 1;
                    if(tmp == K) return;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NK = br.readLine().split(" ");

        int N = Integer.parseInt(NK[0]);
        K = Integer.parseInt(NK[1]);
        map = new int[100000+1];
        visited = new boolean[100000+1];

        bfs(N);
        bw.append(map[K]+"");

        br.close();
        bw.flush();
        bw.close();
    }
}

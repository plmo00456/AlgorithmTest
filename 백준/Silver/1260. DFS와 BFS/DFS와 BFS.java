import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    static int[][] map;
    static boolean[] visited;

    static List<Integer> ansDfs = new ArrayList<>();
    static List<Integer> ansBfs = new ArrayList<>();

    public static void dfs(int st){
        visited[st] = true;
        ansDfs.add(st);

        for(int i=1; i<map[st].length; i++){
            if(map[st][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int st){
        Queue<Integer> q = new LinkedList<>();
        q.add(st);
        visited[st] = true;
        ansBfs.add(st);

        while(!q.isEmpty()){
            int val = q.poll();
            int[] arr = map[val];
            for(int i=1; i<arr.length; i++){
                if(!visited[i] && arr[i] == 1){
                    visited[i] = true;
                    q.add(i);
                    ansBfs.add(i);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] NMK = br.readLine().split(" ");
        int N = Integer.parseInt(NMK[0]);
        int M = Integer.parseInt(NMK[1]);
        int K = Integer.parseInt(NMK[2]);

        map = new int[N+1][N+1];

        for(int i=0; i<M; i++){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            map[a][b] = 1;
            map[b][a] = 1;
        }

        visited = new boolean[N+1];
        dfs(K);
        visited = new boolean[N+1];
        bfs(K);

        for(int i=0; i<ansDfs.size(); i++){
            int val = ansDfs.get(i);
            bw.append(i != ansDfs.size() -1 ? val + " " : val + "");
        }
        bw.append("\n");
        for(int i=0; i<ansBfs.size(); i++){
            int val = ansBfs.get(i);
            bw.append(i != ansBfs.size() -1 ? val + " " : val + "");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
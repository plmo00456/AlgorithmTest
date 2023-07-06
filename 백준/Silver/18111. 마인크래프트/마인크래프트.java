import java.util.*;
import java.io.*;

public class Main {
    static int arr[][];
    static int result[] = new int[2];

    static int time = Integer.MAX_VALUE;
    static int height;
    static int block;
    static int N, M, B;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        arr = new int [N][M];
        int max = 0;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                max = Math.max(max, arr[i][j]);
            }
        }

        brute_force(max);

        System.out.println(time + " " + height);
    }

    static void brute_force(int max) {

        for(int i=0; i<=max; i++) {
            result = excavation(i);

            if(time > result[0]) {
                time = result[0];
                height = result[1];
            }
            
            else if(time == result[0] && height < result[1]) {
                time = result[0];
                height = result[1];
            }

        }
    }

    static int[] excavation(int height) {
        int block = B;
        int time = 0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                int value = arr[i][j];

                if(value == height) {
                    continue;
                }

                if(value > height) {
                    time += (value - height)*2;
                    block += (value - height);
                }

                else {
                    time += height - value;
                    block -= (height - value);
                }
            }
        }

        if(block < 0) {
            result[0] = 999999999;
            return result;
        }

        result[0] = time;
        result[1] = height;

        return result;
    }
}
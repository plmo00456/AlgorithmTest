import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int white = 0;
    public static int blue = 0;
    public static int[][] map;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        for(int i = 0; i < N; i++) {
            String line[] = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        partition(0, 0, N);

        System.out.println(white);
        System.out.println(blue);

    }

    public static void partition(int x, int y, int size) {

        if(colorCheck(x, y, size)) {
            if(map[y][x] == 0) {
                white++;
            }else {
                blue++;
            }
            return;
        }

        int newSize = size / 2;

        partition(x, y, newSize);
        partition(x + newSize, y, newSize);
        partition(x, y + newSize, newSize);
        partition(x + newSize, y + newSize, newSize);
    }


    public static boolean colorCheck(int x, int y, int size) {

        int color = map[y][x];

        for(int i = y; i < y + size; i++) {
            for(int j = x; j < x + size; j++) {
                if(map[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Point[] point = new Point[N];
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            point[i] = new Point(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
        }

        Arrays.sort(point, Comparator.comparingInt(Point::getY).thenComparingInt(Point::getX));
        for(Point p : point)
            bw.append(p.getX() + " " + p.getY()).append("\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
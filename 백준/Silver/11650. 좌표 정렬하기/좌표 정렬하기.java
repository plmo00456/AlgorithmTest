import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

class Point{
	int i;
	int j;
	public Point(String i, String j) {
		this.i = Integer.parseInt(i);
		this.j = Integer.parseInt(j);
	}
}

public class Main {
	
    public static void main(String[] args) throws IOException {
//    	BufferedReader br = new BufferedReader(new FileReader("input.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Point[] ps = new Point[N];
		
		for(int i=0; i<N; i++) {
			String[] str = br.readLine().split(" ");
			ps[i] = new Point(str[0], str[1]);
		}
		Arrays.sort(ps, Comparator.comparingInt((Point p) -> p.i)
                .thenComparingInt(p -> p.j));
        for(Point p : ps) {
        	bw.append(p.i + " " + p.j + "\n");
        }
		bw.flush();
		bw.close();
		br.close();
    }
}

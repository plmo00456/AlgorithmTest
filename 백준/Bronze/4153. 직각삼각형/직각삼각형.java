import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str;
		while(!(str = br.readLine()).equals("0 0 0")) {
			double[] line = {Math.pow(Integer.parseInt(str.split(" ")[0]), 2), Math.pow(Integer.parseInt(str.split(" ")[1]), 2), Math.pow(Integer.parseInt(str.split(" ")[2]), 2)};
			Arrays.sort(line);
			bw.append(line[0] + line[1] == line[2] ? "right\n" : "wrong\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}

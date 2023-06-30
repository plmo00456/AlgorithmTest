import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[] A = br.readLine().split(" ");
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++)
			map.put(Integer.parseInt(A[i]), 1);

		int M = Integer.parseInt(br.readLine());
		String[] B = br.readLine().split(" ");
		for (int i = 0; i < M; i++)
			System.out.println(map.getOrDefault(Integer.parseInt(B[i]), 0));

	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[] strs = br.readLine().split(" ");
		long[] A = new long[N];
		for(int i=0; i<N; i++)
			A[i] = Long.parseLong(strs[i]);
		Arrays.sort(A);
		int M = Integer.parseInt(br.readLine());
		String[] B = br.readLine().split(" ");
		for (int i = 0; i < M; i++) {
			int st = 0;
			int ed = A.length - 1;
			long tar = Long.parseLong(B[i]);
			boolean chk = false;
			if(st == ed && (A[st] == tar || A[ed] == tar))
				chk = true;
			else {				
				while(st != ed) {
					int mid = (ed+st)/2;
					if(A[st] == tar || A[ed] == tar || tar == A[mid]) {
						chk = true;
						break;
					}
					if(tar < A[mid]) {
						ed = mid;
					}else if(tar > A[mid]) {
						st = mid;
					}
					if(ed - st == 1 && (st == mid || ed == mid)) break;
				}
			}
			System.out.println(chk ? 1 : 0);
		}
	}
}

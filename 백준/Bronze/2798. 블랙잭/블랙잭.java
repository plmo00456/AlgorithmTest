import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String NM = br.readLine();
		int N = Integer.parseInt(NM.split(" ")[0]);
		int tar = Integer.parseInt(NM.split(" ")[1]);
		
		int[] card = new int[N];
		String cardStr = br.readLine();
		for(int i=0; i<N; i++)
			card[i] = Integer.parseInt(cardStr.split(" ")[i]);
		Arrays.sort(card);
		
		if(card[0] + card[1] + card[2] >= tar)
			System.out.println(card[0] + card[1] + card[2]);
		else {
			int val = Integer.MAX_VALUE;
			for(int i=0; i<N; i++) {
				for(int j=i+1; j<N; j++) {
					for(int k=j+1; k<N; k++) {
						if(Math.abs(tar - (card[i] + card[j] + card[k])) < val && (card[i] + card[j] + card[k]) <= tar) {
							val = Math.abs(tar - (card[i] + card[j] + card[k]));
						}
					}
				}
			}
			System.out.println(tar - val);
		}
			
		bw.flush();
		bw.close();
		br.close();
	}
}

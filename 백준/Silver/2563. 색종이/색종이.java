import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[][] arr = new boolean[100][100];
		
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int p = x; p<10+x; p++) {
				for(int q = y; q<10+y; q++) {
					arr[p][q] = true;
				}
			}
		}
		int ans = 0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(arr[i][j]) ans++;
			}
		}
		
		System.out.println(ans);
	}
}
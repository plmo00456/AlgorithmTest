import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] num = new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.print(j < M-1 ? num[i][j] + sc.nextInt() + " " : num[i][j] + sc.nextInt());
			}
			System.out.println();
		}
	}
}
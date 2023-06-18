import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] num = new int[9][9];
		int ans = 0;
		int _i = 0;
		int _j = 0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				num[i][j] = sc.nextInt();
				if(ans < num[i][j]) {
					ans = num[i][j];
					_i = i;
					_j = j;
				}
			}
		}
		System.out.println(ans);
		System.out.println((_i+1) + " " + (_j+1));
	}
}
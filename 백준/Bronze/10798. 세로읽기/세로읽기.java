import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[][] strArr = new char[5][15];
		for(int i=0; i<5; i++) {
			strArr[i] = sc.nextLine().toCharArray();
		}
		String str = "";
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(strArr[j].length <= i) continue;
				str += strArr[j][i];
			}
		}
		System.out.println(str);
	}
}
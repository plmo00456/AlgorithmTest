import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long cnt = sc.nextLong();
        String val = sc.next();
        long answer = 0;
        for(int i=0; i<cnt; i++) {
        	answer += Integer.parseInt(val.charAt(i)+"");
        }
		System.out.println(answer);
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		float ans = 0;
		
		int cnt = sc.nextInt();
		sc.nextLine();
		String val = sc.nextLine();
		
		String[] vals = val.split(" ");
		int sum = 0;
		for (int i=0; i<cnt; i++) {
			int _val = Integer.parseInt(vals[i]);
			if(max < _val)
				max = _val;
			sum += _val;
		}
		
		System.out.println((float)sum*100/max/cnt);
	}

}

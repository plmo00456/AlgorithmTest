import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for(int i=0; i<N; i++) {
    		int H = sc.nextInt();
    		int W = sc.nextInt();
    		int A = sc.nextInt();
    		System.out.print(A%H == 0 ? H : A%H);
    		System.out.println((A%H == 0 ? A/H : ((A/H)+1)) < 10 ? "0"+((A%H) == 0 ? A/H : ((A/H)+1)) : ((A%H) == 0 ? A/H : ((A/H)+1)));
    	}
    }
}

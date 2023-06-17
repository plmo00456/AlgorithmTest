import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	
    	for(int i=0; i<N; i++) {
    		int M = sc.nextInt();
    		int sum = 0;
    		int[] scores = new int[M];
    		for(int j=0; j<M; j++) {
    			int score = sc.nextInt();
    			sum += score;
    			scores[j] = score;
    		}
    		double avg = (double)sum/(double)M;
    		int cnt = 0;
    		for(int j=0; j<M; j++) {
    			if(scores[j] > avg) cnt++;
    		}
    		System.out.println(String.format("%.3f", ((double)cnt/(double)M)*100 ) + "%");
    		
    	}
    	
    }
}
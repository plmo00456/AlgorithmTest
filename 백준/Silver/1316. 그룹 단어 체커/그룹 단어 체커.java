import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
		int ans = 0;
    	for(int i=0; i<N; i++) {
    		String str = sc.next();
    		Set<String> set = new HashSet<>();
    		String lastC = str.charAt(0) + "";
    		set.add(lastC);
    		boolean flag = true;
    		for(int j=1; j<str.length(); j++) {
    			if(set.contains(str.charAt(j)+"") && !lastC.equals(str.charAt(j)+"") ) {
    				flag = false;
    				break;
    			}else {
    				lastC = str.charAt(j)+"";
    				set.add(lastC);
    			}
    		}
    		if(flag) ans++;
    	}
    	
    	System.out.println(ans);
			
    }
}
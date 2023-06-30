import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

class Person{
	public int age;
	public String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
}

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Person[] per = new Person[N];
		for(int i=0; i<N; i++) {
			String[] str = br.readLine().split(" ");
			per[i] = new Person(Integer.parseInt(str[0]), str[1]);
		}
		Arrays.sort(per, Comparator.comparingInt(p -> p.age));

		for(Person p : per) {
			System.out.println(p.age + " " + p.name);
		}
    }
}

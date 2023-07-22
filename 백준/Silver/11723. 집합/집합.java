import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Mlsit {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public List<String> list = new ArrayList<>();

    public void controller(String line) throws IOException {
        String[] lines = line.split(" ");
        String flag = lines[0];
        switch (flag) {
            case "add":
                add(lines[1]);
                break;
            case "remove":
                remove(lines[1]);
                break;
            case "check":
                check(lines[1]);
                break;
            case "toggle":
                toggle(lines[1]);
                break;
            case "all":
                all();
                break;
            case "empty":
                empty();
                break;
        }
    }

    public void add(String x) throws IOException {
        if (!list.contains(x))
            list.add(x);
    }

    public void remove(String x) throws IOException {
        if (list.contains(x))
            list.remove(x);
    }

    public void toggle(String x) throws IOException {
        if (list.contains(x))
            list.remove(x);
        else
            list.add(x);
    }

    public void all() {
        list.clear();
        for (int i = 1; i <= 20; i++)
            list.add(i + "");
    }

    public void empty() {
        list.clear();
    }

    public int check(String x) throws IOException {
        boolean chk = list.contains(x);
        bw.append((chk ? 1 : 0)+"\n");
        return chk ? 1 : 0;
    }

    public void close() throws IOException {
        bw.flush();
        bw.close();
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Mlsit list = new Mlsit();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            list.controller(br.readLine());
        }
        br.close();
        list.close();
    }
}

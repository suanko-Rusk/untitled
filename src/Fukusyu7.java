import java.io.*;
public class Fukusyu7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int i = 1;
        while (N >= i) {
            sum += i;
            i += 2;
        }
        System.out.println("結果：" + sum);
    }
}

import java.io.*;
public class Fukusyu10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i <= N; i+=2) {
            sum += i;
        }
        System.out.println(sum);
    }
}

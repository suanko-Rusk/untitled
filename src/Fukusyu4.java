import java.io.*;
public class Fukusyu4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N <= 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}

package Review;

import java.io.*;
public class Review17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        int i = 2;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        System.out.println("結果：" + sum);
    }
}

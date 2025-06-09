package Fukusyu;

import java.io.*;
public class Fukusyu11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int b = 1;
        for (int i = 1; i <= N; i++) {
            b = b * i;
        }
        System.out.println(b);
    }
}

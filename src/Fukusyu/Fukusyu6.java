package Fukusyu;

import java.io.*;
public class Fukusyu6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num % 3 ==0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }else if (num % 3 == 0) {
                System.out.println("Fizz");
        }else if (num % 5 == 0) {
                System.out.println("Buzz");
        }
    }
}

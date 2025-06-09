package Fukusyu;

import java.io.*;
public class Fukusyu5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(br.readLine());
        if (age >= 0) {
            if (age <= 12) {
                System.out.println("子ども");
            }else if (age <= 19) {
                System.out.println("ティーンエイジャー");
            }else if (age <= 64) {
                System.out.println("大人");
            }else if (age <= 100) {
                System.out.println("シニア");
            }
        }
    }
}

package textBook_practice.chapter3;
import java.io.*;
public class Practice6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("【数あてゲーム】");
        int ans = new java.util.Random().nextInt(10);
        for (int i = 0; i < 5; i++) {
            System.out.println("0〜9の数字を入力してください");
            int num = Integer.parseInt(br.readLine());
            if (ans == num) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}

package textBook_practice.chapter2;
import java.io.*;
public class Practice3 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください＞");
        String name = br.readLine();
        System.out.print("あなたの年齢を入力してください＞");
        int age = Integer.parseInt(br.readLine());
        System.out.println("占いの結果がでました！");
        int fortune = new java.util.Random().nextInt(4);
        fortune = fortune + 1;
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.print("1:大吉 2:中吉 3:吉 4:凶");
    }
}

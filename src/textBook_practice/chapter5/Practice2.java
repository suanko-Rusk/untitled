package textBook_practice.chapter5;

public class Practice2 {
    public static void main(String[] args) {
        String title = "ご依頼";
        String address = "241122@std.hi-joho.ac.jp";
        String text = "転職しませんか";
        email(title, address, text);
    }
    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }
}

package Fukusyu;
//impoort このパッケージの、このクラスを使うよ
import calcapp.CalcLogic;

public class Calc2 {
    public static void main(String[] args) {
        int a = 10; int b = 2;
        // ただし、同パッケージに存在するもののみ
        int total = CalcLogic.tasu(a,b);
        int delta = CalcLogic.hiku(a,b);
        System.out.println("足すと" + total + "、引くと" + delta );
    }
}

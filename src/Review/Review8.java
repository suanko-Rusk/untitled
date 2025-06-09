package Review;

public class Review8 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        a = (int)b; //bをint型にした
        a = (int)10000L; //int型に変えた
        b = 10000L;
        b = (int)a;
        float f = (float) 5.94; //5.94をfloatに変換
        short s = 10;
    }
}

package chapter8;

public class Main {
    public static void main(String[] args) {
        //実体化（インスタンス化） クラス名　変数名　＝　new クラス名();
        Hero hero = new Hero();

        Matango m1 = new Matango();
        Matango m2 = new Matango();
        //属性の初期化
        hero.name = "ミナト";
        hero.hp = 100;
        System.out.println("勇者" + hero.name + "を生み出した！");

        m1.hp = 50;
        m1.suffix = 'A';

        m2.hp = 48;
        m2.suffix = 'B';

        //操作
        //hero.sit(5);
        //hero.slip();
        //hero.sit(25);
        //hero.run();

        hero.slip();
        m1.run();
        m2.run();
        hero.run();

        Cleric c1 = new Cleric();
        c1.selfAid();
    }
}

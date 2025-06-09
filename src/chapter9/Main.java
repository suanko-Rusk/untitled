package chapter9;

public class Main {
    public static void main(String[] args) {
        //インスタンス
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        Hero h = new Hero();
        h.name = "ミナト";
        System.out.println(h.name);
        h.hp = 100;
        h.sword = s;
        System.out.println("現在の武器は" + h.sword.name);

        Hero h2 = new Hero();
        h2.name = "アサカ";
        h2.hp = 100;
        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 100;
        w.heal(h);
        w.heal(h2);
        Hero h3 = new Hero();

        Thief th = new Thief("misato",10,4);

        }
    }


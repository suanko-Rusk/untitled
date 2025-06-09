package chapter8;
//勇者の設計図
public class Hero {
    //属性
    String name; //名前
    int hp; //HP
    final int LEVEL = 10;

    //操作

    public void sleep() {
        this.hp = 100; //this はこのクラスの！
        System.out.println(this.hp + "は、眠って回復した！");
    }

    public void sit(int sec) {
        this.hp -= sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
        System.out.println("HPが" + sec + "ポイント回復した");
    }
    public void slip() {
        this.hp += 5;
        System.out.println(this.name + "は、転んだ！");
        System.out.println("5のダメージ！");
    }
    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}

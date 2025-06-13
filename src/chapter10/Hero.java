package chapter10;

public class Hero {

    public Hero(){
        System.out.println("継承元（HERO）");
    }


    String name = "ミナト";
    int hp = 100;

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた！");
    }
    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }
}

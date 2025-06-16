package inheritance;

public class Monster {
    String name;
    int hp;
    int mp;
    public Monster(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
    public void jump() {
        System.out.println(name + "は飛び上がった!");
    }
    public void attack() {
        System.out.println(name + "は攻撃した!");
    }
    public void run() {
        System.out.println(name + "は走った!");
    }
}

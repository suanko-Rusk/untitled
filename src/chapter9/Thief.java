package chapter9;

public class Thief {
    String name;
    int hp;
    int mp;

    public Thief(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }
    public Thief(String name, int hp) {
        this(name, hp, 0);

    }

}

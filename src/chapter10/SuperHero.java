package chapter10;

public class SuperHero extends Hero {

    public SuperHero() {
        super();
    }
    boolean flying = true;
    public void fly() {
        this.flying = true;
        System.out.println("飛び上がった！");
    }
    public void land() {
        this.flying = false;
        System.out.println("着地した！");
    }
    public void run() {
        System.out.println(this.name + "は撤退した");
    }
    public void attack(Matango m) {
       super.attack(m);
       if(flying) {
           super.attack(m);
       }
    }
}

package inheritance;

public class PracticeMain {
    public static void main(String[] args) {
        Monster m = new Monster("スライム", 10, 10);
        m.attack();
        m.jump();
        m.run();
        Slime s = new Slime("スライム");
        s.attack();
        s.run();
    }
}


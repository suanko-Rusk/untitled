package inheritance;

public class Slime extends Monster {
    public  Slime(String name) {
        super(name,10,10);
    }
    public void attack() {
        System.out.println(name + "はたいあたりをした！");
    }
    public void run() {
        System.out.println(name + "はプルプル逃げ出した！");
    }
}

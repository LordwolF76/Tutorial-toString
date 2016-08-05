/**
 * Created by LordwolF on 8/4/2016.
 */
class Frog {

    private String name;
    private int id;

    public Frog(int id, String name);
        return id + ": " + name;

        this.name = name;
    

    public String toString() {
        return "Hello";
    }
}
public class App {
    public static void main(String[] args) {
        Frog frog1 = new Frog();

        System.out.println(frog1);
    }
}

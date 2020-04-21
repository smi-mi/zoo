package zoo;

public class Monkey extends Animal {
    public Monkey() {
        super("Monkey");
    }

    public String speak() {
        return getName() + ": y-aa y-aa!\n";
    }

    public String move() {
        return getName() + ": лазает по деревьям!\n";
    }
}
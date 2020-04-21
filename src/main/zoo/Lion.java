package zoo;

public class Lion extends Animal {
    public Lion() {
        super("Lion");
    }

    public String speak() {
        return getName() + ": pppppp!\n";
    }
    public String move() {
        return getName() + ": бежит!\n";
    }
}
package zoo;

public class Snake extends Animal {
    public Snake() {
        super("Snake");
    }

    public String speak() {
        return getName() + ": шшш_шшш!\n";
    }

    public String move() {
        return getName() + ": ползёт!\n";
    }
}
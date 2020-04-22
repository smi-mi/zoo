package zoo;

public class Duck extends Animal {
    public Duck() {
        super("Duck", Kind.BIRD);
    }

    public String speak() {
        return getName() + ": кря-кря!\n";
    }
    public String move() {
        return getName() + ": летит!\n";
    }
}
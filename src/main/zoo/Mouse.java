package zoo;

public class Mouse extends Animal {
    public Mouse() {
        super("мыш", Kind.MAMMAL);
    }

    public String speak() {
        return getName() + ": пи-пи-пи!\n";
    }

    public String move() {
        return getName() + " (кродёться)\n";
    }
}
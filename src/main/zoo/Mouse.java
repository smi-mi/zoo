package zoo;

public class Mouse extends Animal {
    public Mouse() {
        super("мыш");
    }

    public String speak() {
        return getName() + ": пи-пи-пи!\n";
    }

    public String move() {
        return getName() + " (кродёться)\n";
    }
}
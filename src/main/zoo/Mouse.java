package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mouse extends Animal {
    private static final int CHILDREN_MAX = 3;
    private static final int CHILDREN_MIN = 12;

    public Mouse() {
        super("мыш", Kind.MAMMAL);
    }

    public String speak() {
        return getName() + ": пи-пи-пи!\n";
    }

    public String move() {
        return getName() + " (кродёться)\n";
    }

    public List<Animal> makeProgeny() {
        final int childrenNum = new Random().nextInt(CHILDREN_MAX - CHILDREN_MIN) + CHILDREN_MIN;
        List<Animal> children = new ArrayList<>();
        for (int i = 0; i < childrenNum; ++i) {
            children.add(new Mouse());
        }
        return children;
    }
}
package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Monkey extends Animal {
    private static final int CHILDREN_MAX = 1;
    private static final int CHILDREN_MIN = 1;

    public Monkey() {
        super("Monkey", Kind.MAMMAL);
    }

    public String speak() {
        return getName() + ": y-aa y-aa!\n";
    }

    public String move() {
        return getName() + ": лазает по деревьям!\n";
    }

    public List<Animal> makeProgeny() {
        final int childrenNum = new Random().nextInt(CHILDREN_MAX - CHILDREN_MIN) + CHILDREN_MIN;
        List<Animal> children = new ArrayList<>();
        for (int i = 0; i < childrenNum; ++i) {
            children.add(new Monkey());
        }
        return children;
    }
}
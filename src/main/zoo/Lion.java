package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lion extends Animal {
    private static final int CHILDREN_MAX = 4;
    private static final int CHILDREN_MIN = 1;

    public Lion() {
        super("Lion", Kind.MAMMAL);
    }

    public String speak() {
        return getName() + ": pppppp!\n";
    }
    public String move() {
        return getName() + ": бежит!\n";
    }
    public List<Animal> makeProgeny() {
        final int childrenNum = new Random().nextInt(CHILDREN_MAX - CHILDREN_MIN) + CHILDREN_MIN;
        List<Animal> children = new ArrayList<>();
        for (int i = 0; i < childrenNum; ++i) {
            children.add(new Lion());
        }
        return children;
    }
}
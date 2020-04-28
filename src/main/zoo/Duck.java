package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Duck extends Animal {
    private static final int CHILDREN_MAX = 13;
    private static final int CHILDREN_MIN = 5;

    public Duck() {
        super("Duck", Kind.BIRD);
    }

    public String speak() {
        return getName() + ": кря-кря!\n";
    }
    public String move() {
        return getName() + ": летит!\n";
    }
    public List<Animal> makeProgeny() {
        final int childrenNum = new Random().nextInt(CHILDREN_MAX - CHILDREN_MIN) + CHILDREN_MIN;
        List<Animal> children = new ArrayList<>();
        for (int i = 0; i < childrenNum; ++i) {
            children.add(new Duck());
        }
        return children;
    }
}
package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Snake extends Animal {
    private static final int CHILDREN_MAX = 8;
    private static final int CHILDREN_MIN = 20;

    public Snake() {
        super("Snake", Kind.REPTILE);
    }

    public String speak() {
        return getName() + ": шшш_шшш!\n";
    }

    public String move() {
        return getName() + ": ползёт!\n";
    }

    public List<Animal> makeProgeny() {
        final int childrenNum = new Random().nextInt(CHILDREN_MAX - CHILDREN_MIN) + CHILDREN_MIN;
        List<Animal> children = new ArrayList<>();
        for (int i = 0; i < childrenNum; ++i) {
            children.add(new Snake());
        }
        return children;
    }
}
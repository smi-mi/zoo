package zoo;

public abstract class Animal {
    private final String m_name;

    public enum Kind {
        BIRD,
        MAMMAL,
        REPTILE
    }

    public Animal(final String name) {
        m_name = name;
    }

    /**
     * 
     * @return kind of animal
     */
    public final String getName() { return m_name; }
    /**
     * 
     * @return animal's speach
     */
    public abstract String speak();
    /**
     * 
     * @return way of movement
     */
    public abstract String move();
}
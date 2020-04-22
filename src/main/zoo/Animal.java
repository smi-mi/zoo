package zoo;

public abstract class Animal {
    private final String m_name;
    private final Kind m_kind;

    public enum Kind {
        BIRD,
        MAMMAL,
        REPTILE
    }

    public Animal(final String name, final Kind kind) {
        m_name = name;
        m_kind = kind;
    }

    /**
     * 
     * @return kind of animal
     */
    public final String getName() { return m_name; }
    /**
     * 
     * @return kind of the animal
     */
    public final Kind getKind() { return m_kind; }
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
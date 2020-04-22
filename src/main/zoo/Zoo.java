package zoo;

public class Zoo {
    private final Animal[] m_animals;
    private int m_animalsNum = 0;
    private int m_capacity = 10;
    private boolean m_isClosed = true;

    /**
     * 
     * @implNote default capacity is 10
     */
    public Zoo() {
        m_animals = new Animal[m_capacity];
    }
    /**
     * 
     * @param capacity capacity of the zoo
     */
    public Zoo(final int capacity) {
        m_capacity = capacity;
        m_animals = new Animal[capacity];
    }

    public void open() {
        m_isClosed = false;
    }
    public void close() {
        m_isClosed = true;
    }

    /**
     * 
     * @param animal who is to add
     * 
     * @return "[animal's name] was added successfully!" if added
     */
    public String addAnimal(final Animal animal) {
        if (animal == null) {
            return "Animal is null!\n";
        }
        if (m_animalsNum == m_capacity) {
            return "Can't add animal. The zoo is full!\n";
        }
        m_animals[m_animalsNum] = animal;
        ++m_animalsNum;
        return animal.getName() + " was added successfully!\n";
    }

    /**
     * 
     * @param kind to count
     * @return number of animals with equal kind
     */
    public int countEquals(Animal.Kind kind) {
        int result = 0;
        for (int i = 0; i < m_animalsNum; ++i) {
            if (m_animals[i].getKind() == kind) {
                ++result;
            }
        }
        return result;
    }

    /**
     * 
     * @return speach of each animal joined together if the zoo is open
     */
    public String listen() {
        if (m_isClosed) {
            return "Sorry, the zoo is closed.\n";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < m_animalsNum; ++i) {
            stringBuilder.append(m_animals[i].speak());
        }
        return stringBuilder.toString();
    }
    /**
     * 
     * @return way of movement of each animal joined together if the zoo is open
     */
    public String watch() {
        if (m_isClosed) {
            return "Sorry, the zoo is closed.\n";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < m_animalsNum; ++i) {
            stringBuilder.append(m_animals[i].move());
        }
        return stringBuilder.toString();
    }
}
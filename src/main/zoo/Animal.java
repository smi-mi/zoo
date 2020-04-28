package zoo;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private final String m_name;
    private final Kind m_kind;
    private List<Animal> m_friends;

    public enum Kind {
        BIRD,
        MAMMAL,
        REPTILE
    }

    public Animal(final String name, final Kind kind) {
        m_name = name;
        m_kind = kind;
        m_friends = new ArrayList<>();
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
     * @return list of friends
     */
    public final List<Animal> geetFriendsList() { return m_friends; }
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
/**
 * 
 * Add animal of the same kind to friends list.
 * 
 * @param friend animal to get friends with
 * @return true if friend was added successfully
 */
    public boolean addFriend(Animal friend) {
        return m_kind == friend.getKind() || m_friends.add(friend);
    }
}
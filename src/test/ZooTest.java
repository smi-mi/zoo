import static org.junit.Assert.assertEquals;
import org.junit.Test;
import zoo.*;

public class ZooTest {

    @Test
    public void openCloseTest() {
        final Zoo zoo = new Zoo();
        assertEquals(zoo.listen(), "Sorry, the zoo is closed.\n");
        zoo.open();
        assertEquals(zoo.listen(), "");
        zoo.close();
        assertEquals(zoo.watch(), "Sorry, the zoo is closed.\n");
        zoo.open();
        assertEquals(zoo.watch(), "");
    }

    @Test
    public void addAnimals() {
        final Zoo zoo = new Zoo(3);
        assertEquals(zoo.addAnimal(new Lion()), "Lion was added successfully!\n");
        assertEquals(zoo.addAnimal(null), "Animal is null!\n");
        assertEquals(zoo.addAnimal(new Duck()), "Duck was added successfully!\n");
        assertEquals(zoo.addAnimal(new Lion()), "Lion was added successfully!\n");
        assertEquals(zoo.addAnimal(new Monkey()), "Can't add animal. The zoo is full!\n");
    }

    @Test
    public void listenAnimals() {
        assertEquals(new Duck().speak(), "Duck: кря-кря!\n");
        assertEquals(new Lion().speak(), "Lion: pppppp!\n");
        assertEquals(new Monkey().speak(), "Monkey: y-aa y-aa!\n");

        final Zoo zoo = new Zoo();
        zoo.addAnimal(new Lion());
        zoo.addAnimal(new Duck());
        zoo.addAnimal(new Snake());
        zoo.addAnimal(new Monkey());
        zoo.open();
        assertEquals(zoo.listen(), "Lion: pppppp!\nDuck: кря-кря!\nSnake: шшш_шшш!\nMonkey: y-aa y-aa!\n");
    }

    @Test
    public void watchAnimals() {
        assertEquals(new Duck().move(), "Duck: летит!\n");
        assertEquals(new Lion().move(), "Lion: бежит!\n");
        assertEquals(new Monkey().move(), "Monkey: лазает по деревьям!\n");

        final Zoo zoo = new Zoo(3);
        zoo.addAnimal(new Lion());
        zoo.addAnimal(new Monkey());
        zoo.addAnimal(new Mouse());
        zoo.open();
        assertEquals(zoo.watch(), "Lion: бежит!\nMonkey: лазает по деревьям!\nмыш (кродёться)\n");
    }
}

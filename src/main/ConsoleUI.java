import java.util.Scanner;
 
import zoo.*;
import java.util.HashMap;
 
public class ConsoleUI {
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
 
        while (true) {
            HashMap<String, Zoo> zoos = new HashMap<>(10);
 
            System.out.println("0. Add zoo.");
            System.out.println("1. Add animal.");
            System.out.println("2. Listen.");
            System.out.println("3. Watch.");
            System.out.println("4. Exit");
            int action = in.nextInt();
            in.nextLine();
            switch (action) {
                case 0:
               
                    System.out.print("Enter name of the zoo. \n > ");
                    String zooName = in.nextLine().strip();
 
                    System.out.print("Enter capacity of the zoo. \n > ");
                    final int capacity = in.nextInt();
                    in.nextLine();
                    Zoo zoo = new Zoo(capacity);
                    zoo.open();
 
                    zoos.put(zooName, zoo);
                    break;
               
                case 1:
               
                    System.out.print("Enter name of the zoo. \n > ");
                    zooName = in.nextLine().strip();
                    zoo = zoos.get(zooName);
 
                    System.out.print("Enter animal you want to add: ");
                    String animalName = in.nextLine().strip();
                    Animal animal = (Animal) Class.forName(animalName).newInstance();
                    zoo.addAnimal(animal);
                    break;
               
                case 2:
               
                    System.out.print("Enter name of the zoo. \n > ");
                    zooName = in.nextLine().strip();
                    zoo = zoos.get(zooName);
                    System.out.println(zoo.listen());
                    break;
               
                case 3:
               
                    System.out.print("Enter name of the zoo. \n > ");
                    zooName = in.nextLine().strip();
                    zoo = zoos.get(zooName);
                    System.out.println(zoo.watch());
                    break;
               
                case 4:
                    in.close();
                    return;
            }
        }
    }
}
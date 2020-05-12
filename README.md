# Zoo
Simple model of a zoo with limited capacity and a few kinds of animals.
### Example of usage
```java
Zoo zoo = new Zoo();  // default capacity is 10
zoo.addAnimal(new Lion());
zoo.addAnimal(new Duck());
zoo.listen();  // Sorry, the zoo is closed.
zoo.open();
zoo.listen();  // Lion: pppppp!
               // Duck: кря-кря!
zoo.countEquals(Animal.Kind.BIRD);  // 1
```
----
## Class Animal
Base class for animal. Every animal is one of the three kinds: `BIRD`, `MAMMAL` or `REPTILE`. Has two virtual methods: `speak()` and `move()` which you have to implement in your own derived classes.
Implemented derived classes:
| Derived class | kind | speak() | move() |
|---------|------|-------|------|
| Duck | `BIRD` | Duck: кря-кря! | Duck: летит! |
| Lion | `MAMMAL` | Lion: pppppp! | Lion: бежит! |
| Monkey | `MAMMAL` | Monkey: y-aa y-aa! | Monkey: лазает по деревьям! |
| Mouse | `MAMMAL` | мыш: пи-пи-пи! | мыш (кродёться) |
| Snake | `REPTILE` | Snake: шшш_шшш! | Snake: ползёт! |
----
## Class Zoo
Main class of the project. Can be open or closed.
Method `listen()` provides you with speach of each animal in the order you added them.
Method `watch()` provides you with way of movement of each animal in the order you added them.
Method `countEquals(Animal.Kind kind)` counts animals of the kind.
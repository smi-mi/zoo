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
```
----
## Class Animal
Base class for animal. Has two virtual methods: `speak()` and `move()` which you have to implement in your own derived classes.
Implemented derived classes:
| Derived class | speak() | move() |
|---------|-------|------|
| Duck | Duck: кря-кря! | Duck: летит! |
| Lion | Lion: pppppp! | Lion: бежит! |
| Monkey | Monkey: y-aa y-aa! | Monkey: лазает по деревьям! |
| Mouse | мыш: пи-пи-пи! | мыш (кродёться) |
| Snake | Snake: шшш_шшш! | Snake: ползёт! |
----
## Class Zoo
Main class of the project. Can be open or closed.
Method `listen()` provides you with speach of each animal in the order you added them.
Method `watch()` provides you with way of movement of each animal in the order you added them.

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
Base class for animal.
<br>Every animal is one of the three kinds: `BIRD`, `MAMMAL` or `REPTILE`.</br>
Every animal can become friends with animal of the same kind. 
<br>Has three virtual methods: `speak()`, `move()` and `makeProgeny()` which you have to implement in your own derived classes.</br>

| Derived class | kind | speak() | move() | Offspring |
|---------|------|-------|------|-------|
| Duck | `BIRD` | Duck: кря-кря! | Duck: летит! | 5 - 13 |
| Lion | `MAMMAL` | Lion: pppppp! | Lion: бежит! | 1 - 4 |
| Monkey | `MAMMAL` | Monkey: y-aa y-aa! | Monkey: лазает по деревьям! | 1 |
| Mouse | `MAMMAL` | мыш: пи-пи-пи! | мыш (кродёться) | 3 - 12 |
| Snake | `REPTILE` | Snake: шшш_шшш! | Snake: ползёт! | 8 - 20 |
----
## Class Zoo
Main class of the project. Can be open or closed.
<br>Method `listen()` provides you with speach of each animal in the order you added them.</br>
Method `watch()` provides you with way of movement of each animal in the order you added them.
<br>Method `countEquals(Animal.Kind kind)` counts animals of the kind.</br>
import java.util.*;

class Animal {
    @Override
    public String toString() { return "Animal"; }
}

class Dog extends Animal {
    @Override
    public String toString() { return "Dog"; }
}

class Cat extends Animal {
    @Override
    public String toString() { return "Cat"; }
}

void main(String[] args) {
    // <? extends T>
    List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
    List<Cat> cats = Arrays.asList(new Cat(), new Cat());

    printAnimals(dogs); // вывод Dog как Animal
    printAnimals(cats); // вывод Cat как Animal

    // <? super T>
    List<Animal> animals = new ArrayList<>();
    List<Object> objects = new ArrayList<>();

    addDogs(animals); // добавляем Dog
    addDogs(objects); // добавляем Dog

    System.out.println("animals: " + animals);
    System.out.println("objects: " + objects);
}

// Producer: читаем элементы, но не добавляем
void printAnimals(List<? extends Animal> list) {
    for (Animal a : list) {
        System.out.println(a);
    }
    // list.add(new Dog()); // ошибка
}

// Consumer: добавляем элементы, но не знаем точный тип при чтении
void addDogs(List<? super Dog> list) {
    list.add(new Dog());
    // Dog d = list.get(0); // нельзя, тип неизвестен, только Object
}
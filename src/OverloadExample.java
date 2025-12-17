class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
}

class Animal {
    void sound() { System.out.println("Животное издаёт звук"); }
}

class Dog extends Animal {
    @Override
    void sound() { System.out.println("Собака лает"); }
}

void main(String[] args) {
    // Перегрузка методов
    Calculator calc = new Calculator();
    System.out.println("add(int, int): " + calc.add(2, 3));
    System.out.println("add(double, double): " + calc.add(2.5, 3.5));
    System.out.println("add(int, int, int): " + calc.add(1, 2, 3));

    // Переопределение методов
    Animal animal = new Animal();
    animal.sound(); // Животное издаёт звук

    Dog dog = new Dog();
    dog.sound();    // Собака лает

    // Полиморфизм: ссылка на родителя, объект-потомок
    Animal pet = new Dog();
    pet.sound();    // Собака лает
}
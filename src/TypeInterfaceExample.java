interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

void main(String[] args) {
    Animal animal1 = new Dog();
    animal1.makeSound();         // Woof

    Animal animal2 = new Cat();
    animal2.makeSound();         // Meow

    var dog = new Dog();
    dog.makeSound();             // Woof

    var cat = new Cat();
    cat.makeSound();             // Meow

    // Нельзя создать интерфейс напрямую
    // var animal3 = new Animal();
}
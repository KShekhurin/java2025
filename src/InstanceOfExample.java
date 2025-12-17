class Animal {}
class Dog extends Animal {}

void main() {
    Animal a = new Animal();
    Dog d = new Dog();
    Animal ad = new Dog();

    System.out.println("a instanceof Animal: " + (a instanceof Animal)); // true
    System.out.println("d instanceof Dog: " + (d instanceof Dog));       // true
    System.out.println("d instanceof Animal: " + (d instanceof Animal)); // true
    System.out.println("ad instanceof Dog: " + (ad instanceof Dog));     // true
    System.out.println("ad instanceof Animal: " + (ad instanceof Animal));// true

    Animal nullAnimal = null;
    System.out.println("nullAnimal instanceof Animal: " + (nullAnimal instanceof Animal)); // false

    Animal someAnimal = new Dog();

    if (someAnimal instanceof Dog) {
        Dog dog = (Dog) someAnimal; // безопасное приведение
        System.out.println("someAnimal — это собака!");
    } else {
        System.out.println("someAnimal — это не собака");
    }
}
interface MyInterface {
    // Дефолтный метод (неабстрактный)
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}

// Класс, реализующий интерфейс
class MyClass implements MyInterface {
    // Можно переопределить defaultMethod, но не обязательно
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in MyClass");
    }
}

void main(String[] args) {
    // Вызов default метода через объект класса, реализующего интерфейс
    MyClass obj = new MyClass();
    obj.defaultMethod(); // Выведет: Overridden default method in MyClass

    // Вызов default метода без переопределения (если переопределение отсутствует)
    MyInterface i = new MyClass();
    i.defaultMethod(); // Выведет реализацию дефолтного метода интерфейса, если не переопределён

    // Вызов статического метода интерфейса
    MyInterface.staticMethod(); // Выведет: Static method in interface
}
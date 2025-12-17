interface InterfaceA {
    default void show() {
        System.out.println("Default method A");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("Default method B");
    }
}

// Попытка реализовать оба интерфейса без переопределения вызовет ошибку
class MyClass implements InterfaceA, InterfaceB {
    // Решение: явно переопределяем метод
    @Override
    public void show() {
        // Можно выбрать конкретную реализацию через InterfaceA.super.show() или InterfaceB.super.show()
        InterfaceA.super.show(); // вызов реализации InterfaceA
        InterfaceB.super.show(); // вызов реализации InterfaceB
        System.out.println("MyClass own implementation");
    }
}

void main() {
    MyClass obj = new MyClass();
    obj.show();
}
class Parent {
    int x = 10;

    Parent(int x) {
        System.out.println("Конструктор Parent, x = " + x);
    }

    void show() {
        System.out.println("Метод Parent, x = " + x);
    }
}

class Child extends Parent {
    int x = 20;

    // Вызов конструктора суперкласса
    Child(int x) {
        super(x); // вызывает Parent(int x)
        System.out.println("Конструктор Child, x = " + x);
    }

    // Доступ к полю суперкласса
    void printFields() {
        System.out.println("Child.x = " + x);       // поле Child
        System.out.println("super.x = " + super.x); // поле Parent
    }

    // Доступ к методу суперкласса
    void showParent() {
        super.show(); // вызов метода Parent
    }
}

void main(String[] args) {
    Child c = new Child(100);
    c.printFields();
    c.showParent();
}
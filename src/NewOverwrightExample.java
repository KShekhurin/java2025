class Parent {
    // Метод суперкласса
    void showMessage() {
        System.out.println("Метод Parent");
    }
}

class Child extends Parent {
    // Переопределение метода суперкласса
    @Override
    void showMessage() {
        System.out.println("Метод Child");
    }
}

void main() {
    Parent p = new Parent();
    p.showMessage(); // Вывод: Метод Parent

    Child c = new Child();
    c.showMessage(); // Вывод: Метод Child

    Parent pc = new Child();
    pc.showMessage(); // Вывод: Метод Child (полиморфизм)
}
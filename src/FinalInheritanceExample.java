// Финальный класс
final class Parent {
    void showMessage() {
        System.out.println("Это финальный класс Parent");
    }
}

// Попытка наследования вызовет ошибку компиляции
/*
class Child extends Parent { // Ошибка: cannot inherit from final Parent
    void showMessage() {
        System.out.println("Попытка переопределить");
    }
}
*/

void main(String[] args) {
    Parent p = new Parent();
    p.showMessage(); // Вызывает метод Parent
}
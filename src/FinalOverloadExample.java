class Parent {
    // final метод нельзя переопределять
    public final void showMessage() {
        System.out.println("Это финальный метод Parent");
    }
}

class Child extends Parent {
    // Попытка переопределения вызовет ошибку компиляции
    /*
    @Override
    public void showMessage() {  // Ошибка: cannot override final method
        System.out.println("Попытка переопределить");
    }
    */
}

void main(String[] args) {
    Child c = new Child();
    c.showMessage(); // Вызывает метод Parent
}
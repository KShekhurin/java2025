class Parent {
    void showMessage() {
        System.out.println("Метод Parent");
    }
}

class Child extends Parent {
    // Ошибочный "переопределённый" метод
//    @Override
//    void showMesage() { // опечатка в имени метода
//        System.out.println("Метод Child");
//    }
}
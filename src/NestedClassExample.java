interface OuterInterface {
    // Вложенный класс внутри интерфейса
    class InnerClass {
        public void showMessage() {
            System.out.println("Метод вложенного класса в интерфейсе");
        }
    }
}

void main(String[] args) {
    // Создаём объект вложенного класса через имя интерфейса
    OuterInterface.InnerClass obj = new OuterInterface.InnerClass();
    obj.showMessage();
}
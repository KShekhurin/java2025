public class A {
    // Инициализация при объявлении
    public final int a1 = 10;
    // Инициализация в блоке инициализации экземпляра
    public final int a2;
    {
        a2 = 20;
    }
    // Инициализация в конструкторе
    public final int a3;

    public A(int value) {
        a3 = value; // значение задается при создании объекта
    }


}

void main() {
    A obj1 = new A(30);

    System.out.println("a1 (инициализация при объявлении): " + obj1.a1);
    System.out.println("a2 (инициализация в блоке): " + obj1.a2);
    System.out.println("a3 (инициализация в конструкторе): " + obj1.a3);
}
public class Outer {
    private int privateField = 10;
    int defaultField = 20;
    protected int protectedField = 30;
    public int publicField = 40;

    private void privateMethod() {
        System.out.println("privateMethod: " + privateField);
    }

    public void publicMethod() {
        System.out.println("publicMethod: " + publicField);
    }

    // Внутренний класс
    class Inner {
        void accessOuter() {
            // Доступ к всем полям внешнего класса
            System.out.println(privateField);   // private доступно
            System.out.println(defaultField);   // default доступно
            System.out.println(protectedField); // protected доступно
            System.out.println(publicField);    // public доступно

            // Доступ к методам внешнего класса
            privateMethod();  // private метод доступен
            publicMethod();   // public метод доступен
        }
    }

    public void demo() {
        Inner inner = new Inner();
        inner.accessOuter();
    }
}

void main() {
    Outer outer = new Outer();
    outer.demo();
}
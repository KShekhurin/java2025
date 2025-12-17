package ModdifiersExample.Pack1;

import ModdifiersExample.Pack2.BaseClass;

class DefaultClass { // package-private, класс доступен только в пакете
    int defaultField = 1; // package-private
    public int publicField = 2;
    protected int protectedField = 3;
    private int privateField = 4;

    void defaultMethod() { System.out.println("defaultMethod: " + defaultField); }
    public void publicMethod() { System.out.println("publicMethod: " + publicField); }
    protected void protectedMethod() { System.out.println("protectedMethod: " + protectedField); }
    private void privateMethod() { System.out.println("privateMethod: " + privateField); }

    public void testPrivate() {
        // private доступно внутри класса
        System.out.println("privateField внутри класса: " + privateField);
        privateMethod();
    }
}

public class Main {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        BaseClass otherPackageClass = new BaseClass();

        // Доступ к разным полям и методам
        System.out.println("defaultField: " + obj.defaultField);
        System.out.println("publicField: " + obj.publicField);
        System.out.println("protectedField: " + obj.protectedField);
        // System.out.println("privateField: " + obj.privateField); // ошибка компиляции

        obj.defaultMethod();
        obj.publicMethod();
        obj.protectedMethod();
        // obj.privateMethod(); // ошибка компиляции

        // Доступ к private через метод внутри класса
        obj.testPrivate();

        //otherPackageClass.protectedField; // не получиться так как в другом пакете
        //otherPackageClass.defaultField;
    }
}
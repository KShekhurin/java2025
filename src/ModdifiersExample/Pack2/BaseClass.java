package ModdifiersExample.Pack2;

public class BaseClass {
    int defaultField = 1;          // package-private
    public int publicField = 2;    // public
    protected int protectedField = 3; // protected
    private int privateField = 4;   // private

    void defaultMethod() { System.out.println("defaultMethod: " + defaultField); }
    public void publicMethod() { System.out.println("publicMethod: " + publicField); }
    protected void protectedMethod() { System.out.println("protectedMethod: " + protectedField); }
    private void privateMethod() { System.out.println("privateMethod: " + privateField); }

    public void testPrivate() {
        System.out.println("privateField внутри класса: " + privateField);
        privateMethod();
    }
}
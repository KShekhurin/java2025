void main() {
    //Примитивные типы
    byte byteValue = 5;
    byte byteZero = 0;

    short shortValue = 100;
    short shortZero = 0;

    int intValue = 42;
    int intZero = 0;

    long longValue = 1_000_000L;
    long longZero = 0L;

    float floatValue = 3.14f;
    float floatZero = 0.0f;

    double doubleValue = 2.718;
    double doubleZero = 0.0;

    char charValue = 'A';
    char charZero = '\u0000';

    boolean booleanValue = true;
    boolean booleanZero = false;

    //Ссылочные типы
    String stringValue = "Hello";
    String stringNull = null;

    Integer integerValue = 10;
    Integer integerNull = null;

    Double doubleObjectValue = 5.5;
    Double doubleObjectNull = null;

    Boolean booleanObjectValue = true;
    Boolean booleanObjectNull = null;

    int[] arrayValue = {1, 2, 3};
    int[] arrayNull = null;

    Object objectValue = new Object();
    Object objectNull = null;

    Runnable runnableValue = () -> System.out.println("Running");
    Runnable runnableNull = null;

    // Перечисление
    enum Color { RED, GREEN, BLUE }
    Color colorValue = Color.RED;
    Color colorNull = null;
}
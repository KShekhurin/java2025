void main() {
    // int + double -> double
    int i = 5;
    double d = 2.5;
    System.out.println("int + double = " + (i + d));

    // int / int -> int
    int a = 5;
    int b = 2;
    System.out.println("int / int = " + (a / b));

    // int / double -> double
    System.out.println("int / double = " + (a / d));

    // byte + byte -> int
    byte bt1 = 10;
    byte bt2 = 20;
    int byteSum = bt1 + bt2;
    System.out.println("byte + byte = " + byteSum);

    // char + int -> int
    char c = 'A';
    int x = 5;
    System.out.println("char + int = " + (c + x));

    // char + char -> int
    char c1 = 'A'; // 65
    char c2 = 'B'; // 66
    System.out.println("char + char = " + (c1 + c2));

    // long + int -> long
    long l = 10L;
    int y = 5;
    System.out.println("long + int = " + (l + y));

    // float + double -> double
    float f = 1.5f;
    double d2 = 2.5;
    System.out.println("float + double = " + (f + d2));

    // Явное приведение типов
    double d3 = 5.9;
    int casted = (int) d3;
    System.out.println("double -> int (cast) = " + casted);
}
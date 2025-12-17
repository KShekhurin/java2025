void main() {
    // double -> int (потеря дробной части)
    double d = 9.8;
    int i = (int) d;
    System.out.println("double -> int: " + i); // 9

    // long -> int (возможна потеря диапазона)
    long l = 1_000_000_000_000L;
    int i2 = (int) l;
    System.out.println("long -> int: " + i2); // переполнение

    // int -> short
    int bigInt = 40_000;
    short s = (short) bigInt;
    System.out.println("int -> short: " + s); // -25536

    // int -> byte
    int value = 130;
    byte b = (byte) value;
    System.out.println("int -> byte: " + b); // -126

    // int -> char
    int code = 65;
    char c = (char) code;
    System.out.println("int -> char: " + c); // 'A'

    // double -> float (потеря точности)
    double precise = 1.123456789;
    float lessPrecise = (float) precise;
    System.out.println("double -> float: " + lessPrecise);

    // char -> byte
    char ch = 'Ж'; // код больше 127
    byte b2 = (byte) ch;
    System.out.println("char -> byte: " + b2); // потеря данных
}
void main() {
    //Integer.decode()
    int decInt = Integer.decode("42");        // десятичное
    int octInt = Integer.decode("077");       // восьмеричное
    int hexInt = Integer.decode("0x2A");      // шестнадцатеричное
    int negHexInt = Integer.decode("-0X2A");  // отрицательное шестнадцатеричное
    System.out.println("Integer decimal: " + decInt);
    System.out.println("Integer octal: " + octInt);
    System.out.println("Integer hex: " + hexInt);
    System.out.println("Integer negative hex: " + negHexInt);

    // Long.decode()
    long decLong = Long.decode("123456789");
    long hexLong = Long.decode("0x75BCD15");
    System.out.println("Long decimal: " + decLong);
    System.out.println("Long hex: " + hexLong);

    // Short.decode()
    short decShort = Short.decode("32767");
    short hexShort = Short.decode("0x7FFF");
    System.out.println("Short decimal: " + decShort);
    System.out.println("Short hex: " + hexShort);
}
void main() {
    boolean flag = true;
    char ch = 'A';
    int num = 255;
    double pi = 3.14159;
    String text = "Hello";
    Date now = new Date();

    // %b — логическое значение
    System.out.printf("Boolean value: %b%n", flag);

    // %c — символ
    System.out.printf("Character: %c%n", ch);

    // %d — десятичное целое число
    System.out.printf("Decimal number: %d%n", num);

    // %f — десятичное с плавающей точкой
    System.out.printf("Floating point: %.2f%n", pi);

    // %s — строковое представление
    System.out.printf("String: %s%n", text);

    // Дополнительно: %n — новая строка, %t — дата/время, %% — знак %
    System.out.printf("Current date: %tF%n", now);  // yyyy-MM-dd
    System.out.printf("Percent sign: %% %n");
}
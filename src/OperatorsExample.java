void main() {
    int a = 5;
    int b = 3;

    a += b;  // a = a + b
    System.out.println("a += b: " + a);

    a -= b;  // a = a - b
    System.out.println("a -= b: " + a);

    a *= b;  // a = a * b
    System.out.println("a *= b: " + a);

    a /= b;  // a = a / b
    System.out.println("a /= b: " + a);

    a %= b;  // a = a % b
    System.out.println("a %= b: " + a);

    // Тернарный оператор ?
    int max = (a > b) ? a : b;
    System.out.println("max = " + max);

    // Логические операторы || и &&
    boolean x = true;
    boolean y = false;
    System.out.println("x || y: " + (x || y));
    System.out.println("x && y: " + (x && y));

    //Побитовые операторы | ^ &
    int p = 6; // 110
    int q = 3; // 011
    System.out.println("p | q: " + (p | q));   // 111 -> 7
    System.out.println("p ^ q: " + (p ^ q));   // 101 -> 5
    System.out.println("p & q: " + (p & q));   // 010 -> 2

    // Сравнения: ==, >, >=, <, <=
    System.out.println("a == b: " + (a == b));
    System.out.println("a > b: " + (a > b));
    System.out.println("a >= b: " + (a >= b));
    System.out.println("a < b: " + (a < b));
    System.out.println("a <= b: " + (a <= b));

    // Побитовые сдвиги: >>, >>>, <<
    int shift = 8; // 1000
    System.out.println("shift >> 1: " + (shift >> 1));   // 0100 -> 4
    System.out.println("shift >>> 1: " + (shift >>> 1)); // 0100 -> 4
    System.out.println("shift << 1: " + (shift << 1));   // 10000 -> 16

    // Арифметические операторы + - * / %
    int m = 10;
    int n = 3;
    System.out.println("m + n: " + (m + n));
    System.out.println("m - n: " + (m - n));
    System.out.println("m * n: " + (m * n));
    System.out.println("m / n: " + (m / n));
    System.out.println("m % n: " + (m % n));

    // + со String
    String s1 = "Hello";
    String s2 = "World";
    System.out.println("s1 + s2: " + (s1 + s2));

    // Инкремент и декремент (префикс и постфикс)
    int c = 5;
    System.out.println("c++: " + (c++)); // постфикс
    System.out.println("++c: " + (++c)); // префикс
    System.out.println("c--: " + (c--)); // постфикс
    System.out.println("--c: " + (--c)); // префикс

    // Побитовая инверсия ~ и логическое NOT !
    int z = 5; // 0101
    System.out.println("~z: " + (~z)); // 1010 -> -6
    boolean flag = true;
    System.out.println("!flag: " + (!flag));

    // Скобки ( ) и индексация [ ]
    int result = (m + n) * (a - b);
    System.out.println("(m + n) * (a - b) = " + result);

    int[] arr = {10, 20, 30};
    System.out.println("arr[1]: " + arr[1]);

    // 11. Конкатенация String с другими типами
    System.out.println("String + int: " + ("Value = " + m));
    System.out.println("String + boolean: " + ("Flag = " + flag));
}
void main() {
    // Конструктор с boolean
    Boolean b1 = new Boolean(true);
    Boolean b2 = new Boolean(false);
    System.out.println("Constructor boolean: " + b1 + ", " + b2);

    // Конструктор с String
    Boolean b3 = new Boolean("true");
    Boolean b4 = new Boolean("TrUe");
    Boolean b5 = new Boolean("false");
    Boolean b6 = new Boolean("hello"); // false
    System.out.println("Constructor String: " + b3 + ", " + b4 + ", " + b5 + ", " + b6);

    // valueOf(boolean)
    Boolean b7 = Boolean.valueOf(true);
    Boolean b8 = Boolean.valueOf(false);
    System.out.println("valueOf(boolean): " + b7 + ", " + b8);

    // valueOf(String)
    Boolean b9 = Boolean.valueOf("true");
    Boolean b10 = Boolean.valueOf("False");
    System.out.println("valueOf(String): " + b9 + ", " + b10);

    // Константы Boolean.TRUE / Boolean.FALSE
    Boolean b11 = Boolean.TRUE;
    Boolean b12 = Boolean.FALSE;
    System.out.println("Constants: " + b11 + ", " + b12);

    // Автораспаковка
    Boolean b13 = false;
    Boolean b14 = true;
}
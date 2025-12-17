void main() {
    // int
    int a = 2;
    switch (a) {
        case 1 -> System.out.println("int: Один");
        case 2 -> System.out.println("int: Два");
        default -> System.out.println("int: Другое");
    }

    // Integer
    Integer b = 1;
    switch (b) {
        case 1 -> System.out.println("Integer: Один");
        case 2 -> System.out.println("Integer: Два");
        default -> System.out.println("Integer: Другое");
    }

    // byte
    byte by = 10;
    switch (by) {
        case 5 -> System.out.println("byte: Пять");
        case 10 -> System.out.println("byte: Десять");
        default -> System.out.println("byte: Другое");
    }

    // char
    char ch = 'A';
    switch (ch) {
        case 'A' -> System.out.println("char: Буква A");
        case 'B' -> System.out.println("char: Буква B");
        default -> System.out.println("char: Другая буква");
    }

    // enum
    enum Color { RED, GREEN, BLUE }

    Color color = Color.GREEN;
    switch (color) {
        case RED -> System.out.println("enum: Красный");
        case GREEN -> System.out.println("enum: Зелёный");
        case BLUE -> System.out.println("enum: Синий");
    }

    //String
    String day = "MONDAY";
    switch (day) {
        case "MONDAY" -> System.out.println("String: Понедельник");
        case "FRIDAY" -> System.out.println("String: Пятница");
        default -> System.out.println("String: Другой день");
    }
}
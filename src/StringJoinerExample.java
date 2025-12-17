void main() {
    // Создание StringJoiner с разделителем ", "
    StringJoiner sj1 = new StringJoiner(", ");
    sj1.add("Apple");
    sj1.add("Banana");
    sj1.add("Cherry");
    System.out.println("Joiner with delimiter: " + sj1);
    // Вывод: Apple, Banana, Cherry

    // Создание StringJoiner с разделителем и префиксом/суффиксом
    StringJoiner sj2 = new StringJoiner(" | ", "[", "]");
    sj2.add("Red");
    sj2.add("Green");
    sj2.add("Blue");
    System.out.println("Joiner with prefix and suffix: " + sj2);
    // Вывод: [Red | Green | Blue]

    // Объединение двух StringJoiner
    StringJoiner sj3 = new StringJoiner(", ");
    sj3.add("X");
    sj3.add("Y");

    sj3.merge(sj1); // объединяет sj1 в sj3
    System.out.println("Merged Joiner: " + sj3);
    // Вывод: X, Y, Apple, Banana, Cherry
}
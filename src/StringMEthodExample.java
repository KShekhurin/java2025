void main() {
    String str1 = "  Hello World  ";
    String str2 = "Java";
    String str3 = "HELLO WORLD";

    // 1. length() - возвращает длину строки
    System.out.println("Length: " + str1.length());

    // 2. trim() - убирает пробелы в начале и конце строки
    System.out.println("Trimmed: '" + str1.trim() + "'");

    // 3. toLowerCase() - переводит строку в нижний регистр
    System.out.println("Lower case: " + str1.toLowerCase());

    // 4. toUpperCase() - переводит строку в верхний регистр
    System.out.println("Upper case: " + str2.toUpperCase());

    // 5. substring(beginIndex) - возвращает подстроку с указанного индекса
    System.out.println("Substring from 6: " + str1.substring(6));

    // 6. substring(beginIndex, endIndex) - возвращает подстроку в диапазоне индексов
    System.out.println("Substring 0-5: " + str2.substring(0, 2));

    // 7. contains(CharSequence) - проверяет, содержит ли строка указанную последовательность
    System.out.println("Contains 'World': " + str1.contains("World"));

    // 8. equals(Object) - проверяет равенство строк с учётом регистра
    System.out.println("Equals str1 and str3: " + str1.trim().equals(str3));

    // 9. equalsIgnoreCase(String) - проверяет равенство без учёта регистра
    System.out.println("EqualsIgnoreCase str1 and str3: " + str1.trim().equalsIgnoreCase(str3));

    // 10. replace(CharSequence, CharSequence) - заменяет часть строки на другую
    System.out.println("Replace 'World' with 'Java': " + str1.replace("World", "Java"));
}
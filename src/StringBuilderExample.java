void main() {
    // Пример StringBuilder
    System.out.println("StringBuilder: ");
    StringBuilder sb = new StringBuilder("Hello");

    // 1. append() - добавляет строку/символы
    sb.append(" World");
    System.out.println("append: " + sb);

    // 2. insert() - вставляет строку/символы в указанную позицию
    sb.insert(5, ",");
    System.out.println("insert: " + sb);

    // 3. delete() - удаляет диапазон символов
    sb.delete(5, 6);
    System.out.println("delete: " + sb);

    // 4. deleteCharAt() - удаляет символ по индексу
    sb.deleteCharAt(0);
    System.out.println("deleteCharAt: " + sb);

    // 5. replace() - заменяет диапазон символов на новую строку
    sb.replace(0, 5, "Hi");
    System.out.println("replace: " + sb);

    // 6. reverse() - меняет порядок символов на обратный
    sb.reverse();
    System.out.println("reverse: " + sb);

    // 7. charAt() - возвращает символ по индексу
    System.out.println("charAt(0): " + sb.charAt(0));

    // 8. setCharAt() - заменяет символ по индексу
    sb.setCharAt(0, 'h');
    System.out.println("setCharAt: " + sb);

    // 9. capacity() - текущая ёмкость буфера
    System.out.println("capacity: " + sb.capacity());

    // 10. length() - длина строки
    System.out.println("length: " + sb.length());

    // Пример StringBuffer
    System.out.println("\nStringBuffer: ");
    StringBuffer sbf = new StringBuffer("Java");

    // 1. append()
    sbf.append(" Programming");
    System.out.println("append: " + sbf);

    // 2. insert()
    sbf.insert(4, " Language");
    System.out.println("insert: " + sbf);

    // 3. delete()
    sbf.delete(4, 13);
    System.out.println("delete: " + sbf);

    // 4. deleteCharAt()
    sbf.deleteCharAt(0);
    System.out.println("deleteCharAt: " + sbf);

    // 5. replace()
    sbf.replace(0, 4, "C++");
    System.out.println("replace: " + sbf);

    // 6. reverse()
    sbf.reverse();
    System.out.println("reverse: " + sbf);

    // 7. charAt()
    System.out.println("charAt(0): " + sbf.charAt(0));

    // 8. setCharAt()
    sbf.setCharAt(0, 'c');
    System.out.println("setCharAt: " + sbf);

    // 9. capacity()
    System.out.println("capacity: " + sbf.capacity());

    // 10. length()
    System.out.println("length: " + sbf.length());
}
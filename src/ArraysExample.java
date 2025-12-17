void main() {
    int[] arr1 = {5, 2, 8, 3, 1};
    int[] arr2 = {5, 2, 8, 3, 1};
    int[] arr3 = {1, 2, 3, 5, 8};

    // 1. toString(...) — преобразование массива в строку
    System.out.println("arr1: " + Arrays.toString(arr1));

    // 2. equals(...) — проверка массивов на одинаковость содержимого
    System.out.println("arr1.equals(arr2): " + Arrays.equals(arr1, arr2));
    System.out.println("arr1.equals(arr3): " + Arrays.equals(arr1, arr3));

    // 3. sort(...) — сортировка массива
    Arrays.sort(arr1);
    System.out.println("arr1 после сортировки: " + Arrays.toString(arr1));

    // 4. binarySearch(...) — поиск элемента (массив должен быть отсортирован)
    int index = Arrays.binarySearch(arr1, 3); // ищем 3
    System.out.println("Индекс 3 в arr1: " + index);

    // 5. compare(...) — сравнение двух массивов (лексикографически)
    int cmp = Arrays.compare(arr1, arr3);
    System.out.println("Сравнение arr1 и arr3: " + cmp); // 0 если равны, >0 если arr1>arr3, <0 если arr1<arr3

    // Пример использования с компаратором для объектов (Integer[])
    Integer[] objArr = {5, 2, 8, 3, 1};
    Arrays.sort(objArr, Comparator.reverseOrder()); // сортировка по убыванию
    System.out.println("objArr по убыванию: " + Arrays.toString(objArr));
}
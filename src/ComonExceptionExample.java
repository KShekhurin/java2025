void setAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("Возраст не может быть отрицательным");
    }
}

void main() {
    // ArithmeticException — деление на ноль
    try {
        int a = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException пойман");
    }

    // ArrayIndexOutOfBoundsException — выход за границы массива
    try {
        int[] arr = {1, 2, 3};
        int x = arr[5];
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBoundsException пойман");
    }

    // IllegalArgumentException — неверный аргумент метода
    try {
        setAge(-5);
    } catch (IllegalArgumentException e) {
        System.out.println("IllegalArgumentException пойман");
    }

    // ClassCastException — неверное приведение типов
    try {
        Object obj = "text";
        Integer num = (Integer) obj;
    } catch (ClassCastException e) {
        System.out.println("ClassCastException пойман");
    }

    // NullPointerException — обращение к null
    try {
        String s = null;
        s.length();
    } catch (NullPointerException e) {
        System.out.println("NullPointerException пойман");
    }
}
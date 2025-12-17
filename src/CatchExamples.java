class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

void throwException(int level) throws Ex1 {
    if (level == 1) throw new Ex1();
    if (level == 2) throw new Ex2();
    if (level == 3) throw new Ex3();
}

void main() {
    try {
        int[] arr = {1, 2, 3};
        System.out.println(arr[10]);      // ArrayIndexOutOfBoundsException
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
        // Одинаковая обработка для разных исключений
        System.out.println("Ошибка вычисления или работы с массивом");
    }

    // Обработка исключений, образующих иерархию Ex1 <- Ex2 <- Ex3
    try {
        throwException(3);
    } catch (Ex3 e) {
        System.out.println("Поймано Ex3");
    } catch (Ex2 e) {
        System.out.println("Поймано Ex2");
    } catch (Ex1 e) {
        System.out.println("Поймано Ex1");
    }
}
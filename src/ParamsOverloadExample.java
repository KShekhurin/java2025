public class Calculator {
    // Метод с фиксированными параметрами
    public int sum(int a, int b) {
        System.out.println("Summing two");
        return a + b;
    }

    // Перегрузка: метод с переменным числом параметров
    public int sum(int... numbers) {
        int result = 0;
        for (int n : numbers) {
            result += n;
        }
        return result;
    }
}

void main() {
    Calculator calc = new Calculator();

    // Вызов метода с фиксированными параметрами
    System.out.println("sum(2, 3) = " + calc.sum(2, 3));

    // Вызов метода с переменным числом параметров
    System.out.println("sum(1, 2, 3, 4, 5) = " + calc.sum(1, 2, 3, 4, 5));

    // Можно вызвать с одним аргументом
    System.out.println("sum(10) = " + calc.sum(10));

    // Можно вызвать без аргументов
    System.out.println("sum() = " + calc.sum());
}
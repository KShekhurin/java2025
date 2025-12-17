class Calculator {
    // Метод для сложения двух целых чисел
    int sum(int a, int b) {
        return a + b;
    }

    // Перегрузка: метод для сложения трёх целых чисел
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Перегрузка: метод для сложения двух чисел с плавающей точкой
    double sum(double a, double b) {
        return a + b;
    }
}

void main() {
    Calculator calc = new Calculator();

    System.out.println(calc.sum(2, 3));        // 5
    System.out.println(calc.sum(1, 2, 3));     // 6
    System.out.println(calc.sum(2.5, 3.5));    // 6.0
}
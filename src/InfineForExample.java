void main() {
    int count1 = 0;
    while (true) {
        System.out.println("while бесконечный цикл, шаг " + count1);

        if(count1 == 10) // в джаве недостижимая часть кода — ошибка
            break;

        count1++;
    }

    int count2 = 0;
    do {
        System.out.println("do-while бесконечный цикл, шаг " + count2);
        count2++;
    } while (true);
}
void main() {
    System.out.println("Пример continue");
    for (int i = 1; i <= 5; i++) {
        if (i == 3) {
            continue;
        }
        System.out.println("i = " + i);
    }

    System.out.println("Пример break");
    for (int i = 1; i <= 5; i++) {
        if (i == 4) {
            break;
        }
        System.out.println("i = " + i);
    }
}
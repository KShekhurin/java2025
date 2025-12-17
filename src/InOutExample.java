void main() {
    System.out.print("Введите имя: ");

    Scanner scan = new Scanner(System.in);
    String name = scan.next();

    System.out.printf("Привет, %s!%n", name);
}
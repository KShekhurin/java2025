void main() {
    try {
        File file = new File("example.txt");
        Scanner scanner = new Scanner(file);

        // Читаем файл построчно
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close(); // закрываем Scanner
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
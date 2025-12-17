void main() {
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
        String text = "Hello";
        // Метод write(int) записывает один байт за раз
        for (char c : text.toCharArray()) {
            baos.write(c); // преобразуем символ в байт
        }
        // Преобразуем накопленные байты обратно в строку
        String result = baos.toString();
        System.out.println("Output: " + result);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
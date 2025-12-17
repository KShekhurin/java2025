void main() {
    String text = "Hello World";
    byte[] data = text.getBytes(); // преобразуем строку в массив байт

    try (ByteArrayInputStream bais = new ByteArrayInputStream(data)) {
        int b;
        while ((b = bais.read()) != -1) { // читаем по одному байту
            System.out.print((char) b);   // преобразуем байт в символ
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
void main() {
    Integer a = null;

    try {
        // автораспаковка null в примитив int
        int b = a;
        System.out.println(b);
    } catch (NullPointerException e) {
        System.out.println("NullPointerException");
    }
}
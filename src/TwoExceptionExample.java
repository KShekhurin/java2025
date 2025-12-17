void main() {
    try {
        int a = 10 / 0; // ArithmeticException
    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException перехвачено");
    }

    String s = null;
    System.out.println(s.length()); // NullPointerException
}
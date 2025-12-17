class NewA {
    int a;
    int b;
    int c;
    int z;

    // Базовый конструктор
    public NewA() {
        z = 1;
    }

    // Конструктор с 1 параметром
    public NewA(int a) {
        this();       // вызов конструктора без параметров
        this.a = a;
    }

    // Конструктор с 2 параметрами
    public NewA(int a, int b) {
        this(a);      // вызов конструктора с 1 параметром
        this.b = b;
    }

    // Конструктор с 3 параметрами
    public NewA(int a, int b, int c) {
        this(a, b);   // вызов конструктора с 2 параметрами
        this.c = c;
    }
}
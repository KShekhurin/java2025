class Box<T> {
    T value;
    Box(T value) { this.value = value; }
}

void main(String[] args) {
    Box<String> stringBox = new Box<>("Hello");
    Box<Integer> intBox = new Box<>(123);

    //При компиляции на самом деле происходит затирание типа T
    //Это хорошо заметно, если попытаться реализовать несколько параметризованных интерфейсов одного типа
    if (stringBox instanceof Box) {
        System.out.println("stringBox это Box");
    }

    if (intBox instanceof Box) {
        System.out.println("intBox это Box");
    }
}
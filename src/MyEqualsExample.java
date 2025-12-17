class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // одинаковые ссылки

        if (obj == null || getClass() != obj.getClass())
            return false; // null или другой класс

        Person other = (Person) obj;
        return age == other.age && name.equals(other.name);
    }
}

void main(String[] args) {
    Person p1 = new Person("Alice", 25);
    Person p2 = new Person("Alice", 25);
    Person p3 = new Person("Bob", 30);

    System.out.println(p1.equals(p2)); // true
    System.out.println(p1.equals(p3)); // false
}
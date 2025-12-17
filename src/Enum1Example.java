enum Day {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String russianName; // поле для хранения значения

    // Конструктор enum
    Day(String name) {
        this.russianName = name;
    }

    // Геттер
    public String getRussianName() {
        return russianName;
    }
}

void main() {
    for (Day day : Day.values()) {
        System.out.println(day + " — " + day.getRussianName());
    }
}
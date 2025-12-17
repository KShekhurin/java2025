enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Дополнительный метод
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

void main(String[] args) {
    for (Day day : Day.values()) {
        System.out.println(day + " — выходной? " + day.isWeekend());
    }
}
void main() {
    Date now = new Date();

    // %tH — час в 24-часовом формате (00–23)
    System.out.printf("Hour (24h): %tH%n", now);

    // %tI — час в 12-часовом формате (01–12)
    System.out.printf("Hour (12h): %tI%n", now);

    // %tM — минуты (00–59)
    System.out.printf("Minutes: %tM%n", now);

    // %tS — секунды (00–59)
    System.out.printf("Seconds: %tS%n", now);

    // %tY — год в 4-значном формате
    System.out.printf("Year: %tY%n", now);

    // Дополнительно, для наглядности:
    // %tB — полное название месяца
    System.out.printf("Month: %tB%n", now);

    // %tA — полное название дня недели
    System.out.printf("Weekday: %tA%n", now);
}
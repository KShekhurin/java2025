class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

void checkAge(int age) throws InvalidAgeException {
    if (age < 0) {
        throw new InvalidAgeException("Возраст не может быть отрицательным");
    }
}

void main() {
    try {
        checkAge(-5);
    } catch (InvalidAgeException e) {
        System.out.println(e.getMessage());
    }
}
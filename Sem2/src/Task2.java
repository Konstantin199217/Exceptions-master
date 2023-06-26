public class Task2 {

    public static void main(String[] args) {
        try {
            check("ыва", "s5");
        } catch (InvalidNameException  | InvalidAgeException e) {
            System.out.println("Ошибка " + e.getMessage());
        }

    }

    public static void check(String name, String age) throws InvalidNameException, InvalidAgeException {
        if (name.trim().isEmpty()) throw new InvalidNameException("Некорректное имя пользователя");
        if (!age.matches("\\d+$") || Integer.parseInt(age) < 0) throw new InvalidAgeException(" Некорректный возвраст");
        System.out.println("Успешная регистрация ");
    }

    static class InvalidNameException extends Exception {

        public InvalidNameException(String message) {
            super(message);
        }
    }

    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

}

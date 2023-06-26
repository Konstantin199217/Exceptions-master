import java.util.Scanner;

public class Password {
//    Задача: Проверка правильности ввода пароля
//    Напишите программу, которая запрашивает у пользователя пароль. Правила для пароля следующие:
//
//    Длина пароля должна быть не менее 8 символов.
//    Пароль должен содержать хотя бы одну заглавную букву.
//    Пароль должен содержать хотя бы одну цифру.
//    Пароль должен содержать хотя бы один специальный символ (!@#$%^&*).
//    Если пользователь вводит неправильный пароль, программа должна выбрасывать исключение InvalidPasswordException с сообщением о причине ошибки. Необходимо обработать исключение и вывести соответствующее сообщение.

//    public class PasswordValidationExample {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Введите пароль: ");
//            String password = scanner.nextLine();
//
//            try {
//                validatePassword(password);
//                System.out.println("Пароль прошел проверку");
//            } catch (InvalidPasswordException e) {
//                System.out.println("Ошибка: " + e.getMessage());
//            }
//        }
//
//        }
//        public static void validatePassword(String password) throws InvalidPasswordException {
//            if (password.length() < 8) {
//                throw new InvalidPasswordException("Пароль должен содержать не менее 8 символов");
//            }
//
//            if (!password.matches(".*[A-Z].*")) {
//                throw new InvalidPasswordException("Пароль должен содержать хотя бы одну заглавную букву");
//            }
//
//            if (!password.matches(".*\\d.*")) {
//                throw new InvalidPasswordException("Пароль должен содержать хотя бы одну цифру");
//            }
//
//            if (!password.matches(".*[!@#$%^&*].*")) {
//                throw new InvalidPasswordException("Пароль должен содержать хотя бы один специальный символ (!@#$%^&*)");
//            }
//
//
//    }
//
//    static  class InvalidPasswordException extends Exception {
//        public InvalidPasswordException(String message) {
//            super(message);
//        }
//    }
//}


    public static void main(String[] args) {
        try {
            checkassword("Aaaa1a@a");
        }catch (InvalidPasswordException e){
            System.out.println("Ошибка пароля " + e.getMessage());
        }
    }

    public static void checkassword(String password) throws InvalidPasswordException {
        if (password.length() > 8) throw new InvalidPasswordException("Длина пароля должна быть не менее 8 символов");
        if (!password.matches(".*[A-Z].*"))
            throw new InvalidPasswordException("Пароль должен содержать хотябы одну заглавную букву");
        if (!password.matches(".*[\\d].*"))
            throw new InvalidPasswordException("Пароль должен содержать хотябы одну цифру");
        if (!password.matches(".*[!@#$%^&*].*"))
            throw new InvalidPasswordException("Пароль должен содержать хотя бы один специальный символ (!@#$%^&*).");
        System.out.println("Пароль корректен ");
    }


    static class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String message) {
            super(message);
        }

    }

}

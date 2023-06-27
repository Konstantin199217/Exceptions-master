import java.util.Scanner;

public class Task3 {
    /*Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:
    Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением
    "Первое число вне допустимого диапазона".
    Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением
    "Второе число вне допустимого диапазона".
    Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением
    "Сумма первого и второго чисел слишком мала".
    Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением
    "Деление на ноль недопустимо".
    В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
    - необходимо создать 3 класса собвстенных исключений*/

    public static void main(String[] args) {
        try {
            threeNums();
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void threeNums() throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число для проверки: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число для проверки: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число для проверки: ");
        int c = scanner.nextInt();
        if (a > 100) throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        if (b < 0) throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        if (a + b < 10) throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        if (c == 0) throw new DivisionByZeroException("Деление на ноль недопустимо");
        System.out.println(a + " "+ b + " "+ c + " ");
    }

    public static class NumberOutOfRangeException extends Exception {
        public NumberOutOfRangeException(String message) {
            super(message);
        }
    }

    static class NumberSumException extends Exception {
        public NumberSumException(String message) {
            super(message);
        }
    }

    public static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }
}



import java.util.Scanner;

public class Task2 {
    /*Задача 2:
    Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
    Если второе число равно нулю, программа должна выбрасывать
    исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
    В противном случае, программа должна выводить результат деления.*/

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();
            System.out.println(" ");
            divNum(a, b);
            scanner.close();
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void divNum(int a, int b) throws DivisionByZeroException {
        if (b == 0) throw new DivisionByZeroException("Деление на ноль недопустимо");
        int res = a / b;
        System.out.println(res);
    }

    public static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }
}
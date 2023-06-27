import java.util.Scanner;

public class Task1 {

    /*Задача 1:
    Напишите программу, которая запрашивает у пользователя число и проверяет,
    является ли оно положительным. Если число отрицательное или равно нулю,
    программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
    В противном случае, программа должна выводить сообщение "Число корректно".

*/
    public static void main(String[] args) {
        try {
            aboveZero();
        }catch (InvalidNumberException e){
            System.out.println(e.getMessage());
        }
    }

    public static void aboveZero() throws InvalidNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int a = scanner.nextInt();
        if (a < 0) throw new InvalidNumberException("Некорректное число");
        System.out.println(a + " Число корректно");
        scanner.close();
    }

    public static class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
            super(message);
        }
    }
}


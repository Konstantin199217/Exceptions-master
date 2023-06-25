import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Простая задача 2: Обработка некорректного ввода
        Напишите программу, которая запрашивает у пользователя его возраст.
        Если введенное значение не является числом,
        выбросите исключение NumberFormatException с сообщением "Некорректный ввод".
        Иначе выведите возраст на экран.*/
        task2();
    }

    public static void task2() {

        boolean x = true;
        while (x) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите свой возраст: ");
                int a1 = scanner.nextInt();
                System.out.println("Ваш возраст " + a1);
                x = false;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод");
                x = true;
            }

        }

    }
}

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    /*Простая задача 1: Проверка деления на ноль
    Напишите программу, которая запрашивает у пользователя два целых числа
    и выполняет их деление. Если второе число равно нулю,
    выбросите исключение ArithmeticException с сообщением
    "Деление на ноль недопустимо". Иначе выведите результат деления на экран.*/
    task1();


    }

    public static void task1() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите два числа: ");
            int a1 = scanner.nextInt();
            System.out.println("/");
            int a2 = scanner.nextInt();
            System.out.println(" ");
            System.out.println(a1 / a2);
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль недопустимо");
        }

    }
}
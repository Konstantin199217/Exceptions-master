import java.util.Scanner;

public class PowerCalculator {
    /*Задача1. Напишите программу-калькулятор, которая запрашивает у пользователя
    два числа и выполняет операцию возведения первого числа в степень второго числа.
    Если введены некорректные числа или происходит деление на ноль, необходимо обработать
    соответствующие исключения и вывести информативное сообщение об ошибке.
    Важно! С использованием принципа одного уровня абстракции!
    **В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(),
    выполняющий операцию возведения числа в степень. Если введено некорректное основание (ноль) и
    отрицательная степень, выбрасывается исключение InvalidInputException.
*/
    public static void main(String[] args) {
        try {
            double a = getInputNumber("Введите первое число: ");
            double b = getInputNumber("Введите второе число: ");
            calculatePower(a,b);
        }catch (Exception e){
            System.out.println("Некорректный ввод ");
        }
    }

    public static double calculate(double a, double b) throws InvalidInputException {
        try {
            if (a == 0){
                throw new InvalidInputException("введено некорректное основание (ноль)");
            }
            if(b == 1){
                return a;
            }else {
                return a * calculate(a, b - 1);
            }
        }catch (InvalidInputException e){
            System.out.println(e.getMessage());
            return Double.NaN;
        }
    }

    public static void calculatePower(double x, double y){
        try {
            if (y < 0){
                throw new InvalidInputException(" Отрицательная степень ");
            }

            double res = calculate(x,y);
            if(!Double.isNaN(res)){
                System.out.println("Результат: "+ res);
            }
        }catch (InvalidInputException e){
            System.out.println("Ошибка "+ e.getMessage());
        }
    }

    private static double getInputNumber(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }
    static class InputMismatchException extends Exception{
        public InputMismatchException(String message){
            super(message);
        }
    }
}
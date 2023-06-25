import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) {
        /*Напишите программу, которая считывает содержимое текстового файла,
        в котором каждая строка содержит одно число.
        Программа должна подсчитать сумму всех чисел в файле.
        Если встретится строка, которая не может быть преобразована в число,
        выбросите исключение NumberFormatException с сообщением
        "Некорректное значение числа в файле".*/
        task3();
    }

    public static void task3(){
        try {
            FileReader fr = new FileReader("C:\\Progek\\Exxeptions-master\\HomeWork\\src\\File");
            BufferedReader br = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не был создан ");
        }


    }
}

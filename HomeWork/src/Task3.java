import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Random;

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

    public static void task3() {
        try {
            FileReader fr = new FileReader("File1.txt");
            BufferedReader bf =new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String c = bf.readLine();
            while (c != null) {
                sb.append(c + ", ");
                c = bf.readLine();
            }
            System.out.println(sb);
            String str = String.valueOf(sb);
            String[] str1 = str.split(", ");
            int[] num = new int[str1.length];
            for (int i = 0; i < str1.length; i++) {
                num[i] = Integer.parseInt(str1[i]);
            }
            int res = 0;
            for (int i = 0; i < num.length; i++) {
                res = res + num[i];
            }
            System.out.println(res);
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не был создан ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            System.out.println("Некорректное значение числа в файле");
        }
    }


}

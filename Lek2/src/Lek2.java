import java.io.File;
import java.util.Collection;
import java.util.Collections;

public class Lek2 {
    public static void main(String[] args) {
      test1();
    }

    static void test1(){
        int number = 1;
        try {
            number = 10 / 1;
            String t = null;
            //System.out.println(t.length());
            Collections.emptyList().add(new Object());
        }catch (ArithmeticException e){
            System.out.println(" Делить на ноль нельзя ");
        }catch (NullPointerException e){
            System.out.println("Пустая строка");
        }catch (Exception e){
            System.out.println("Ошибка");
        }
        System.out.println(number);
    }
}
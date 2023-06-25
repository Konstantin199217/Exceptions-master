import java.io.File;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Application {
    public static void main(String[] args) {
        // System.out.println(getFileSize(new File("123")));
        //divide(10,0);
        //a();
        System.out.println(devide(10, 0));
    }
    public static int devide(int a1, int a2){
        if (a2 == 0){
            throw new RuntimeException(" Делить на ноль нельзя ");
        }
        return a1/a2;
    }

    public static void a(){
        b();
    }
    public static void b(){
        c();
    }
    public static void c(){
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }



    public static int divide(int a1, int a2) {

        return a1 / a2;
    }


    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }
        return file.length();
    }
}
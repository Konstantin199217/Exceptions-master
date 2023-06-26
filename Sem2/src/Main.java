public class Main {
    public static void main(String[] args) {
        try {
            myInput(-1);
        }catch (MyException e){
            System.out.println("Ошибка "+ e.getMessage());
        }
    }


    public static void myInput(int value) throws MyException {
        if (value < 0){
            throw new MyException("Значение не может быть отрицательным ");
        }
        System.out.println("Обработка значения " + value);

    }

    //свое исключение
    static class MyException extends Exception {

        public MyException(String message) {
            super(message);
        }
    }
}
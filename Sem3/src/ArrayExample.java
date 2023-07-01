public class ArrayExample {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        int element = getElementAtIndex(array, 6);
        System.out.println("Значение элемента: "+ element);
    }

    public static int getElementAtIndex(int[] array, int index){
        try {
            return array[index];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка: Индекс выходит за приделы массива");
        }
        return 0;
    }
}

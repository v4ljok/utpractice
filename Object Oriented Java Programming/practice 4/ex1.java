import java.util.Arrays;
import java.util.Random;
public class ex1 {
    public static int[] array;
    public static void main(String[] args) {
        randomArray();
        System.out.println(Arrays.toString(array));
        selectionSort();
        printArray();
    }
    public static void printArray() {
        System.out.print("[");
        for (int i = 0; i < array.length; i++)
            if (i == array.length - 1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        System.out.println("]");
    }
    public static void randomArray() {
        Random rand = new Random();
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101)+1;
        }
    }
    public static void selectionSort() {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int max_i = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] > max) {
                    max = array[j];
                    max_i = j;
                }
            if (i != max_i) {
                int tmp = array[i];
                array[i] = array[max_i];
                array[max_i] = tmp;
            }
        }
    }
}

import java.util.Arrays;

public class ex3 {
    public byte[] array;
    public static String sortTheOdd(byte[] arr) {
        byte[] array = arr;
        byte oddCount = 0;

        for (byte el : array)
            if (el % 2 != 0)
                oddCount++;

        byte[] array2 = new byte[oddCount];
        byte index = 0;

        for (byte el : array) {
            if (el % 2 != 0) {
                array2[index] = el;
                index++;
            }
        }
        Arrays.sort(array2);
        byte y = 0;
        for (byte i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array2[i - y];
            }
            else
                y++;
        }
        String str1 = Arrays.toString(array);
        return str1;
    }
    public static void main(String[] args) {
        System.out.println(sortTheOdd(new byte[]{7, 1})); //  =>  {1, 7}
        System.out.println(sortTheOdd(new byte[]{5, 8, 6, 3, 4})); //  =>  {3, 8, 6, 5, 4}
        System.out.println(sortTheOdd(new byte[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})); //  =>  {1, 8, 3, 6, 5, 4, 7, 2, 9, 0}
    }
}

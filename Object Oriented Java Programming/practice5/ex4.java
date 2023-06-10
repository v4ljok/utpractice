import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ex4 {
    static LinkedList<LinkedList<Integer>> listOflinkedList = new LinkedList<>();
    static LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        listOflinkedList.add(new LinkedList<>(Arrays.asList(1, 4, 5)));
        listOflinkedList.add(new LinkedList<>(Arrays.asList(1, 3, 4)));
        listOflinkedList.add(new LinkedList<>(Arrays.asList(2, 6)));

        for (LinkedList<Integer> el : listOflinkedList) {
            for (int num : el)
                linkedList.add(num);
        }
        Collections.sort(linkedList);
        System.out.println(linkedList.toString());
    }
}

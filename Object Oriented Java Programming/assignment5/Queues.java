import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    private static Queue<Integer> queueI = new LinkedList<>();
    private static Queue<String> queueS = new LinkedList<>();
    public static void main(String[] args) {
        queueI.add(1);
        queueI.add(2);
        queueI.add(3);

        System.out.println("Before stutter: " + queueI);

        stutter(queueI);

        System.out.println("After stutter: " + queueI);

        queueS.add("a");
        queueS.add("b");
        queueS.add("c");

        System.out.println("Before mirror: " + queueS);

        mirror(queueS);

        System.out.println("After mirror: " + queueS);
    }
    public static void stutter(Queue<Integer> queue) {
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            int element = queue.remove();
            queue.add(element);
            queue.add(element);
        }

    }
    public static void mirror(Queue<String> queue) {
        Queue<String> queueCopy = new LinkedList<>();
        for (String el : queue) {
            queueCopy.add(el);
        }
        int size = queueCopy.size();
        int x = size - 1;
        while (x != 0) {
            for (int i = 1; i < size; i++) {
                if (i < (size - 1)) {
                    queueCopy.remove();
                    x--;
                }
                if (i == x) {
                    queueCopy.add(queueCopy.remove());
                    x--;
                }
            }
        }
        for (String el : queueCopy) {
            queue.add(el);
        }
        queue.add(queue.element());
    }
}
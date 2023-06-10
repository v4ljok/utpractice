import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

import static java.util.Arrays.asList;

public class Stacks {
    private static Stack<Integer> stack = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();
    private static Stack<Integer> stack3 = new Stack<>();
    public static void main(String[] args) {
        stack.add(3);
        stack.add(7);
        stack.add(1);
        stack.add(14);
        stack.add(9);

        System.out.println("Before stutter: " + stack);

        stutter(stack);

        System.out.println("After stutter: " + stack);

        stack2.add(3);
        stack2.add(3);
        stack2.add(7);
        stack2.add(7);
        stack2.add(1);
        stack2.add(1);
        stack2.add(14);
        stack2.add(14);
        stack2.add(9);
        stack2.add(9);

        System.out.println("Before equals: " + stack + " and " + stack2);

        System.out.println("After equals: " + equals(stack, stack2));

        stack3.add(3);
        stack3.add(7);
        stack3.add(1);
        stack3.add(14);
        stack3.add(9);

        System.out.println("Before equals: " + stack + " and " + stack3);

        System.out.println("After equals: " + equals(stack, stack3));
    }
    public static void stutter(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        for (Integer el : stack) {
            queue.add(el);
            queue.add(el);
        }
        while (!stack.empty()) {
            stack.pop();
        }
        for (Integer el : queue) {
            stack.push(el);
        }
    }

    public static boolean equals(Stack<Integer> stackFirst, Stack<Integer> stackSecond) {
        return Objects.equals(stackFirst, stackSecond);
    }
}

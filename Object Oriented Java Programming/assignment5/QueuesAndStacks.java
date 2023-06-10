import java.util.*;

import static java.util.Arrays.asList;


public class QueuesAndStacks {
    private static boolean answer;
    private static Queue<Integer> queue1 = new LinkedList<>(asList(3, 8, 17, 9, 17, 8, 3));
    private static Queue<Integer> queue2 = new LinkedList<>(asList(3, 17, 9, 4, 17, 3));
    private static Queue<Integer> queue3 = new LinkedList<>(asList());
    private static Queue<Integer> queue4 = new LinkedList<>(asList(1, 2, -2, 4, -5, 8, -8, 12, -15));
    private static Queue<Integer> queue5 = new LinkedList<>(asList(2, 8, -5, 19, 7, 3, 24, 42));
    private static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) {
        System.out.println("Is " + queue1 + " a palindrome?");
        System.out.println(isPalindrome(queue1));

        System.out.println("Is " + queue2 + " a palindrome?");
        System.out.println(isPalindrome(queue2));

        System.out.println("Is " + queue3 + " a palindrome?");
        System.out.println(isPalindrome(queue3));

        System.out.println("Before reorder: " + queue4);
        System.out.println("After reorder: " + reorder(queue4));

        System.out.println("Before interleave: " + queue5);
        System.out.println("After interleave: " + interleave(queue5));

        stack.push(2);
        stack.push(8);
        stack.push(3);
        stack.push(19);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(7);
        stack.push(12);
        System.out.println("Before removeMin: " + stack);
        System.out.println("minValue: " + removeMin(stack));
        System.out.println("After removeMin: " + stack);
        stack.pop();
        System.out.println("Before removeMin: " + stack);
        System.out.println("minValue: " + removeMin(stack));
        System.out.println("After removeMin: " + stack);
    }
    public static boolean isPalindrome(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        for (Integer el : queue)
            stack.push(el);
        for (Integer el : queue) {
            if (!Objects.equals(el, stack.pop())) {
                answer = false;
                break;
            }
            if (stack.empty())
                answer = true;
        }
        if (queue.poll() == null)
            answer = true;
        return answer;
    }
    public static Queue<Integer> reorder(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<Integer>();
        int highestPN = Integer.MIN_VALUE;
        for (int el : queue) {
            if (highestPN < el) {
                highestPN = el;
            }
        }
        int n = queue.size();
        for (int i = 0; i < n; i++) {
            int value = queue.remove();
            if (value < 0) {
                stack.push(value);
            } else {
                queue.add(value);
            }
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        int refN = 1;
        while (refN != highestPN) {
            refN = queue.remove();
            queue.add(refN);
        }
        return queue;
    }

    public static Queue<Integer> interleave(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            throw new IllegalArgumentException("Queue size must be even");
        }
        Stack<Integer> s = new Stack<>();
        int halfSize = q.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            s.push(q.remove());
        }
        while (!s.empty()) {
            q.add(s.pop());
        }
        for (int i = 0; i < halfSize; i++) {
            q.add(q.remove());
        }
        for (int i = 0; i < halfSize; i++) {
            s.push(q.remove());
        }
        while (!s.empty()) {
            q.add(s.pop());
            q.add(q.remove());
        }
        return q;
    }

    public static int removeMin(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();
        int min = s.peek();
        while (!s.empty()) {
            int n = s.pop();
            if (n < min) {
                min = n;
            }
            q.add(n);
        }
        while (!q.isEmpty()) {
            int n = q.remove();
            if (n != min) {
                s.push(n);
            }
        }
        return min;
    }
}

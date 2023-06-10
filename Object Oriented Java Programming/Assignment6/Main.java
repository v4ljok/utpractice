import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Leetspeak leetspeak = new Leetspeak();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a word: ");
        String input = scanner.nextLine();
        String output = leetspeak.encode(input);
        System.out.println(output);
    }
}
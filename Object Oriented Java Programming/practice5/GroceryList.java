import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class GroceryList {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                        Available actions:
                        0 - to shutdown
                        1 - to add item(s) to list (comma delimited list)
                        2 - to remove any items (comma delimited list)

                        Enter a number for which action you want to do:\s""";
        int choice;
        do {
            System.out.print(menu);
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Program completed.");
                    break;
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    removeItem(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }

    static void addItem(Scanner scanner) {
        System.out.print("Enter item(s) to add (comma delimited): ");
        String input = scanner.nextLine();
        String[] items = input.split(",");

        for (String item : items)
            if (!list.contains(item.trim()))
                list.add(item.trim());

        Collections.sort(list);
        System.out.println("Grocery list: " + list);
    }

    static void removeItem(Scanner scanner) {
        System.out.print("Enter item(s) to remove (comma delimited): ");
        String input = scanner.nextLine();
        String[] items = input.split(",");

        for (String item : items)
            list.removeIf(i -> i.trim().equals(item.trim()));

        Collections.sort(list);
        System.out.println("Grocery list: " + list);
    }
}
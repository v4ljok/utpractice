import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ex2 {
    private static String menu;
    private static String choice;
    private static LinkedList<Town> listOfPlaces = new LinkedList<>();
    private static ListIterator<Town> iterator = null;

    public static void main(String[] args) {
        listOfPlaces.add(new Town("Tallinn", 0));
        listOfPlaces.add(new Town("Helsinki", 86.6));
        listOfPlaces.add(new Town("Riga", 310.9));
        listOfPlaces.add(new Town("Vilnius", 601.7));
        listOfPlaces.add(new Town("Moscow", 1025.6));
        listOfPlaces.add(new Town("St.Petersburg", 363.7));
        listOfPlaces.add(new Town("London", 2618.4));

        listOfPlaces.sort(Comparator.comparingDouble(town -> town.getDistanceFromStart()));

        iterator = listOfPlaces.listIterator();

        Scanner scanner = new Scanner(System.in);
        menu = """
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";

        System.out.println(menu);

        boolean running = true;

        while (running) {
            System.out.print("Enter a letter for which action you want to do:\s");
            choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "f":
                    moveForward();
                    break;
                case "b":
                    moveBackward();
                    break;
                case "l":
                    System.out.println(listOfPlaces);
                    break;
                case "m":
                    System.out.println(menu);
                    break;
                case "q":
                    System.out.println("Program completed.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
    static void moveForward() {
        if (iterator.hasNext()) {
            Town nextTown = iterator.next();
            System.out.println("Moved forward to " + nextTown);
        } else {
            System.out.println("Already at the end of the itinerary");
        }
    }

    static void moveBackward() {
        if (iterator.hasPrevious()) {
            Town previousTown = iterator.previous();
            System.out.println("Moved backward to " + previousTown);
        } else {
            System.out.println("Already at the beginning of the itinerary");
        }
    }
}

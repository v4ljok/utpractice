public class ex4 {
    public static void printYearAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
        }
        else {
            long days = (minutes / 60) / 24;
            long year = days / 365;
            days = days % (year * 365);
            System.out.println(minutes + " min = " + year + " y and " + days + "d");
        }
    }
    public static void main(String[] args) {
        printYearAndDays(5687787);
    }
}

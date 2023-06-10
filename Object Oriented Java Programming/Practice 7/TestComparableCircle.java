public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(4);

        if (c1.compareTo(c2) > 0) {
            System.out.println("The larger circle is: c1");
        } else {
            System.out.println("The larger circle is: c2");
        }
    }
}

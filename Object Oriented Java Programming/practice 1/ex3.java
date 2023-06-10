public class ex3 {
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        else {
            double areaOfACircle = Math.PI * radius * radius;
            return areaOfACircle;
        }
    }
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        else {
            double areaOfARectangle = x * y;
            return areaOfARectangle;
        }
    }
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }
}

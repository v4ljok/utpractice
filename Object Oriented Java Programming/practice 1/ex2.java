public class ex2 {
    public static double convertToCentimeters(int heightInInches) {
        double heightInCentimeters = heightInInches * 2.54;
        return heightInCentimeters;
    }
    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        heightInInches += (heightInFeet * 12);
        double heightInCentimeters = convertToCentimeters(heightInInches);
        return heightInCentimeters;
    }
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(20));
        System.out.println(convertToCentimeters(5, 8));
    }
}

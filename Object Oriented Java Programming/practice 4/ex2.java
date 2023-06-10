public class ex2 {
    public static double findUniq(double[] arr) {
        double uniqueNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (uniqueNum != arr[i]) {
                if (i == 1 || (i > 1 && arr[i-2] == uniqueNum)) {
                    return arr[i];
                } else {
                    return uniqueNum;
                }
            }
        }
        return uniqueNum;
    }
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{ 1, 1, 1, 2, 1, 1 })); // => 2
        System.out.println(findUniq(new double[]{ 0, 0, 0.55, 0, 0 })); // => 0.55
    }
}

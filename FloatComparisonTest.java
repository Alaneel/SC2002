public class FloatComparisonTest {
    public static void main(String[] args) {
        // floating point numbers are NOT precise
        double d1 = 2.2 + 4.4;
        double d2 = 6.6;
        System.out.println(d1 == d2); // use str1.equals(str2) instead of ==
        System.out.println(d1);

        // Set a threshold for comparison with ==
        final double EPSILON = 1e-7;
        System.out.println(Math.abs(d1 - d2) < EPSILON); // true
    }
}

/*
 * Illustrate "int" overflow
 */
public class OverFlowTest {
    public static void main(String[] args) {
        // Range of int is [-2147483648, 2147483647]
        int i1 = 2147483647; // maximum int
        System.out.println(i1 + 1); // overflow: -2147483648
        System.out.println(i1 + 2); // overflowL -2147483647
        System.out.println(i1 + 3); // overflow: -2147483646
        System.out.println(i1 * 2); // overflow: -2
        System.out.println(i1 * i1); // overflow: 1

        int i2 = -2147483648; // minimum int
        System.out.println(i2 - 1); // overflow: 2147483647
        System.out.println(i2 - 2); // overflow: 2147483646
        System.out.println(i2 * i2); // overflow: 0
    }
}

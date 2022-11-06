/*
 * Test Relational and Logical Operators
 */
public class RelationalLogicalOpTest {
    public static void main(String[] args) {
        int age = 18;
        double weight = 71.23;
        int height = 191;
        boolean married = false;
        boolean attached = false;
        char gender = 'm';

        System.out.println(!married && !attached && (gender == 'm')); // true
        System.out.println(married && (gender == 'f')); // false
        System.out.println((height >= 180) && (weight >= 65) && (weight <= 80)); // true
        System.out.println((height >= 180) || (weight >= 90)); // true
        System.out.println(!married && (age >= 21) && (age <= 35) && (height >= 180) && (weight >= 70) && (weight <= 80));
    }
}

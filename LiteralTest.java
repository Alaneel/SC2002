/*
 * Test Literals for various primitive types
 */
public class LiteralTest {
    public static void main(String[] args) {
        String name = "Tan Ah Teck"; // String is double-quoted
        char gender = 'm'; // char is single-quoted
        boolean isMarried = true; // boolean is either true or false
        byte numChildren = 8; // Range of byte is [-127, 128]
        short yearOfBirth = 1945; // Range of short is [-32768, 32767], beyond byte
        int salary = 88000; // beyond the ranges of byte and short
        long netAsset = 8234567890L; // Need suffix 'L' for long, beyond int
        double weight = 88.88; // With fractional part
        float gpa = 3.88f; // Need suffix 'f' for float

        // println() can be used to print value of any type
        System.out.println("Name is: " + name);
        // Name is: Tan Ah Teck
        System.out.println("Gender is: " + gender);
        // Gender is: m
        System.out.println("Is married is: " + isMarried);
        // Is married is: true
        System.out.println("Number of children is: " + numChildren);
        // Number of children is: 8
        System.out.println("Year of birth is: " + yearOfBirth);
        // Year of birth is: 1945
        System.out.println("Salary is: " + salary);
        // Salary is: 88000
        System.out.println("Net Asset is: " + netAsset);
        // Net Asset is 8234567890
        System.out.println("Weight is: " + weight);
        // Weight is 88.88
        System.out.println("GPA is: " + gpa);
        // GPA is 3.88
    }
}

/*
 * Compute the average of running numbers 1 to 100
 */
public class Average1To100 {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        for (int number = 1; number <= 100; ++number) {
            sum += number;
        }
        average = (double)sum / 100;
        System.out.println("Average is " + average); // Average is 50.0
    }
}

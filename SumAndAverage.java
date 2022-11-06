/*
 * Sum the running integers from lowerbound to an upperbound.
 * Also compute the average
 */
public class SumAndAverage {
    public static void main(String[] args) {
        // Declare variables
        int sum = 0; // store the accumulated sum
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        double average;

        // Use a for-loop to accumulate the sum
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }
        average = (double)sum / (UPPERBOUND - LOWERBOUND + 1); // need to cast int to double first
        // Print results
        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum);
        // The sum from 1 to 1000 is: 505000
        System.out.println("The average is: " + average);
        // The average is: 500.5

        // Sum only the OOD numbers
        int count = 0; // counts of ood numbers
        sum = 0; // reset sum for accumulation again
        // Adjust the LOWERBOUND to the next odd number if it is a even number
        // Use a for-loop to accumulate the sum with step size of 2
        for (int number = LOWERBOUND; number <= UPPERBOUND && number % 2 == 1; number += 2) {
            ++count;
            sum+=number;
        }
        average = (double)sum / count;
        System.out.println("The sum of odd numbers is: " + sum);
        // The sum of odd numbers if: 250000
        System.out.println("The average of odd numbers is: " + average);
        // The average of odd numbers is: 500.0
    }
}

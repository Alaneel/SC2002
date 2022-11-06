/*
 * Find the sums of the running odd numbers and even numbers from a given lowerbound to an upperbound
 * Also compute their absolute difference
 */
public class OddEvenSum { // Save as "OddEvenSum.java"
    public static void main(String[] args) {
        // Declare variables
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000; // Define the bounds
        int sumOdd = 0; // For accumulating odd numbers, init to 0
        int sumEven = 0; // For accumulating even numbers, init to 0
        int absDiff = 0;

        // Use a while loop to accumulate the sums from LOWERBOUND TO UPPERBOUND
        int number = LOWERBOUND; // loop init
        while (number <= UPPERBOUND) { // loop test
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+1, ... , UPPERBOUND for each iteration
            // If-else decision
            if (number % 2 == 0) { // Even
                sumEven += number;
            }
            else { // Odd
                sumOdd += number;
            }
            ++number; // Loop update for the next number
        }

        // Another if-else decision
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        }
        else {
            absDiff = sumEven - sumOdd;
        }
        // OR using one liner conditional expression
        // absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : sumEven - sumOdd

        // Print the results
        System.out.println("The sum of odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumOdd);
        System.out.println("The sum of even numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumEven);
        System.out.println("The absolute difference between the two sums is " + absDiff);
    }
}

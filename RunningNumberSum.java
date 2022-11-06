/*
 * Sum from a lowerbound to an upperbound using a while-loop
 */
public class RunningNumberSum { // Save as "RunningNumberSum.java"
    public static void main(String[] args) {
        final int LOWERBOUND = 1; // store the lowerbound
        final int UPPERBOUND = 1000; // store the upperbound
        int sum = 0; // Declare an int variable sum to accumulate the numbers, set the initial sum to 0

        // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) 
        {
            // number = LOWERBOUND, LOWERBOUND + 1, LOWERBOUND + 2, ... , UPPERBOUND for each iteration
            sum = sum + number;
            ++number;
        }
        // Print the result
        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }
}

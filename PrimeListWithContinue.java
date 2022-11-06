public class PrimeListWithContinue {
    public static void main(String[] args) {
        final int UPPERBOUND = 100;
        int sum = 0;
        
        for (int number = 1; number <= UPPERBOUND; ++number) {
            if (number % 11 == 0) continue;
            sum += number;
        }

        System.out.printf("The sum is %d%n", sum);

        /*
        It is better to re-write the loop as:
        for (int number = 1; number <= UPPERBOUND; ++number) {
            if (number % 11 != 0) sum += number;
        */
    }
}

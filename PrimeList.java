/*
 * List all prime numbers between 2 and an upperbound
 */

public class PrimeList {
    public static void main(String[] args) {
        final int UPPERBOUND = 100;
        for (int number = 2; number <= UPPERBOUND; ++number) {
            // Not prime, if there is a factor between 2 and sqrt(number)
            int maxFactor = (int)Math.sqrt(number);
            boolean isPrime = true;
            int factor = 2;
            while (isPrime && factor <= maxFactor) {
                if (number % factor == 0) { // Factor of number?
                    isPrime = false;
                }
                ++factor;
            }
            if (isPrime) System.out.println(number + " is a prime");
        }
    }
}

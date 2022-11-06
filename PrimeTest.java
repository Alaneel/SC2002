import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        x = in.nextInt();
        in.close();

        // To test whether an int x is a prime
        int maxFactor = (int)Math.sqrt(x);
        boolean isPrime = true;
        for (int factor = 2; factor <= maxFactor; ++factor) {
            if (x % factor == 0) {
                isPrime = false;
                break; // a factor found, no need to find more factors
            }
        }

        if (isPrime == true) {
            System.out.println(x + " is a prime");
        } else {
            System.out.println(x + " is not a prime");
        }
    }
}

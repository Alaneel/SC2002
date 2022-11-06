import java.util.Scanner;
public class PerfectNumberTest {
    public static void main(String[] args) {
        int sum = 0, x;
        boolean isProperDivisor = true, isPerfectNumber = false;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        x = in.nextInt();
        in.close();

        for (int i = 1; i < x; ++i) {
            if (x % i == 0) {
                isProperDivisor = true;
                if (isProperDivisor) sum += i;
            }
        }

        if (sum == x) {
            isPerfectNumber = true;
        } else {
            isPerfectNumber = false;
        }

        if (isPerfectNumber) {
            System.out.println(x + " is a perfect number");
        } else {
            System.out.println(x + " is not a perfect number");
        }
    }
}

public class ForLoop {
    public static void main(String[] args) {
        // Sum from 1 to UPPERBOUND
        int sum = 0;
        final int UPPERBOUND = 100;
        for (int number = 1; number <= UPPERBOUND; number++) {
            sum += number;
        }
        System.out.println("sum is: " + sum);

        int n = 5;
        int factorial = 1;
        for (int num = 1; num <= n; num++)
        {
            factorial *= num;
        }
        System.out.println("factorial is: " + factorial);
    }
}

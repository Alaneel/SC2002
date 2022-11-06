public class DoWhileLoop {
    public static void main(String[] args) {
        // Sum from 1 to UPPERBOUND
        int sum = 0;
        final int UPPERBOUND = 100;
        int number = 1;
        do {
            // number = 1, 2, 3, ..., UPPERBOUND for each iteration
            sum += number;
            ++number;
        } while (number <= UPPERBOUND);
        System.out.println("sum is: " + sum);

        // Factorial of n (=1*2*3*...*n)
        int n = 5;
        int factorial = 1;
        int num = 1;
        do {
            // num = 1, 2, 3, ..., n for each iteration
            factorial *= num;
            ++num; // update
        } while (num <= n); 
        System.out.println("factorial is: " + factorial);
    }
}

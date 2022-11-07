import java.util.Random;

public class TestRandomClass {
    public static void main(String[] args) {
        // Allocate a pseudo-random number generator with default random seed
        Random random = new Random();

        // Generate the next 10 pseudo-random uniformly distributed int value between 0(inclusive) and 100(exclusive)
        for (int i = 0; i < 10; ++i) {
            System.out.print(random.nextInt(100) + " ");
        }
        System.out.println();

        // Generate the next pseudo-random uniformly distributed double/float value between 0.0(inclusive) and 1.0(exclusive)
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());

        // Allocate the next pseudo-random number generator with the specified seed value
        Random anotherRandom = new Random(12345);
        // Generate the "same" sequence of 10 integers
        for (int i = 0; i < 10; ++i) {
            System.out.print(anotherRandom.nextInt(100) + " ");
        }
        System.out.println();
    }
}

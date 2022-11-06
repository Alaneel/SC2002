import java.util.Scanner;

public class ForPrintCheckerPattern {
    public static void main(String[] args) {
        final int SIZE;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        SIZE = in.nextInt();
        in.close();

        for (int row = 1; row <= SIZE; row++) {
            if ((row % 2) == 0) {
                System.out.print(" ");
            }
            for (int col = 1; col <= SIZE; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

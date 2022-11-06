import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int a, b;
        int temp;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a and b: ");
        a = in.nextInt();
        b = in.nextInt();
        in.close();
        
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD is " + a);
    }
}

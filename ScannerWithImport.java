import java.util.Scanner;

public class ScannerWithImport {
    public static void main(String[] args) {
        // Package name can be omitted for an imported class
        // Java compiler searches the import statements for the fully-qualified name
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int number = in.nextInt();
        in.close();
        System.out.println("You have eatered: " + number);
    }
}

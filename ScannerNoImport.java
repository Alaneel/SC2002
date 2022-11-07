public class ScannerNoImport {
    public static void main(String[] args) {
        // Use fully-qualified name in "ALL" the references
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter a integer: ");
        int number = in.nextInt();
        in.close();
        System.out.println("You have entered: " + number);
    }
}
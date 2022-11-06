public class ClassLoaderTest {
    public static int number1 = 11; // expliviy iniyislizer
    static {
        System.out.println("running static initializer...");
        number1 = 99;
        number2 = 88;
        System.out.println("number1 is " + number1);
        // System.out.println("number2 is: " + number2);
        // compilation error: illegal forward reference
    }
    private static int number2 = 22; // explicit initializer

    public static void main(String[] args) {
        System.out.println("running main()...");
        System.out.println("in main(): number1 is " + number1 + ", number2 is: " + number2); 
    }
    // running static initializer...
    // number1 is 99
    // running main()...
    // in main(): number1 is 99, number 2 is: 22
}

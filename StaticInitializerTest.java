public class StaticInitializerTest {
    static int number; // a static variable
    static {
        number = 88;
        System.out.println("running static initializer...");
    }

    public static void main(String[] args) { // Test Driver
        System.out.println("running main()...");
        System.out.println("number is: " + number);
    }
    // running static initializer...
    // running main()...
    // number is: 88
}
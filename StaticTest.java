public class StaticTest {
    private static String msgStatic = "Hello from static"; // a static variable
    // private String msgInstance = "Hello from non-static"; // a non-static instance variable
    public static void main(String[] args) {
        System.out.println(msgStatic);
        // Hello from static
        // System.out.println(msgInstance)
        // compilation error: non-static variable xxx cannot be referenced from a static context
    }
}

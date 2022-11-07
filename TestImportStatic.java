import static java.lang.System.out; // import static variable "out" of "Sytem" class
import static java.lang.Math.*; // import "All" static variable/methods in "Math" class

public class TestImportStatic {
    public static void main(String[] args) {
        // Classname can be omitted for imported static variables/methods
        out.println("HEllom PI is " + PI);
        out.println("Square root of PI is " + sqrt(PI));
    }
}

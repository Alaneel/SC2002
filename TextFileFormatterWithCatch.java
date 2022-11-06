/*
 * Output to file
 * Technique 2: Use try-catch to handle exception
 */
import java.io.File;
import java.util.Formatter; // <== note
import java.io.FileNotFoundException; // <== note

public class TextFileFormatterWithCatch {
    public static void main(String[] args) {
        try { // try the following statements
            // Construct a Formatter to write formatted output to a text file
            Formatter out = new Formatter(new File("out.txt"));
            // Write to file with format() method (similar to printf())
            int num1 = 1234;
            double num2 = 55.66;
            String name = "Pauline";
            out.format("Hi %s,%n", name);
            out.format("The sum of %d and %.2f is %.2f%n", num1, num2, num1 + num2);
            out.close(); // Close the file
            System.out.println("Done"); // Print to concole
        } catch (FileNotFoundException ex) { // catch the exception here
            ex.printStackTrace(); // Print the stack trace
        }
    }
}

import java.util.Scanner;

public class ValidateBinStringVersionTwo {
    public static void main(String[] args) {
        // Declare the variables
        String inStr; // The input string
        int inStrLen; // The length of the input string
        char inChar; // Each char of the input string

        // Prompt and read input as "String"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        inStr = in.next();
        inStrLen = inStr.length();
        in.close();

        for (int inCharIdx = 0; inCharIdx < inStrLen; ++inCharIdx) {
            inChar = inStr.charAt(inCharIdx);
            if (!(inChar == '0' || inChar == '1')) {
                System.out.println("\"" + inStr + "\" is NOT a binary string");
                return; // exit the program upon the first error detected
            }
        }
        // for-loop completed, no error detected
        System.out.println("\"" + inStr + "\" is a binary string");
    }
}

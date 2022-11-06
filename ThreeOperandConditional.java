public class ThreeOperandConditional {
    public static void main(String[] args) {
        int num1 = 9, num2 = 8, max;
        max = (num1 > num2) ? num1 : num2; // RHS returns num1 or num2
        // same as
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        System.out.println(max);

        int value = -9, absValue;
        absValue = (value > 0) ? value : -value; // RHS returns value or -value
        // same as
        if (value > 0) {
            absValue = value;
        } else {
            absValue = -value;
        }
        System.out.println(absValue);

        int mark = 48;
        System.out.println((mark >= 50) ? "PASS" : "FAIL"); // RHS returns "PASS" or "FAIL"
        // same as;
        if (mark >= 50) System.out.println("PASS");
        else System.out.println("FAIL");
    }
}

// Testing boolean method (method that returns a boolean value)

public class BooleanMethodTest {
    public static boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isOdd(5)); // true
        System.out.println(isOdd(6)); // false
        System.out.println(isOdd(-5)); // true, notice that -5 % 2 = -1
    }
}

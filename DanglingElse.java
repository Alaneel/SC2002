public class DanglingElse { // Applying explicit braces to avoid danging-else problems
    public static void main(String[] args) {
        // Force the else-clause to associate with the outer-if with parentheses
        int i = 0, j = 0;
        if (i == 0) {
            if (j == 0)
                System.out.println("i and j are zero");
        } else {
            System.out.println("i is not zero"); // non-ambiguous for outer-if
        }

        // Force the else-clause to associate with the inner-if with parentheses
        i = 0;
        j = 0;
        if (i == 0) {
            if (j == 0) {
                System.out.println("i and j are zero");
            } else {
                System.out.println("i is zero, j is not zero");
            }
        }
    }
}

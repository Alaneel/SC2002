public class AutomaticVariableTest {
    public static void main(String[] args) { // scope of method parameter args is within this method
        for (int i = 0; i < 10; ++i) { // scope of i is within the for-loop
            System.out.println(i);
        }
        // System.out.println(i); // i has gone out of scope
        // compilation error: cannot find symbol

        int j = 0; // scope of j is within the method, from this statement onwards (forward reference)
        for (j=0; j<10; j++) {
            System.out.println(j); // okay
        }
        System.out.println(j); // okay

        /*
        int k = 1;
        do {
            int x = k * k;
            ++k;
            System.out.println(k);
        } while (x < 100);  // compilation error: cannot find symbol
        */
    }
}

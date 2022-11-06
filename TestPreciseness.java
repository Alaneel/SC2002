/*
 * Test Preciseness for int/float/double
 */
public class TestPreciseness {
    public static void main(String[] args) {
        // double arer NOT precise
        System.out.println(2.2 + 4.4); //6.6000000000000005
        System.out.println(6.6 - 2.2 - 4.4); //-8.881784197001252E-16 (NOT Zero!)
        // Compare two doubles
        System.out.println((6.6) == (2.2 + 4.4)); //false

        // int is precise, float/double are NOT!
        int i1 = 123456789;
        System.out.println(i1 * 10); //1234567890 (exact within the range)
        
        float f1 = 123456789.0f; // float keeps 6-7 significant digits
        System.out.println(f1); //1.23456792E8 (=123456792 close but not exact)
        System.out.println(f1 * 10); //1.23456794E9 (=1234567940)
    }
}

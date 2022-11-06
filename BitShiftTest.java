public class BitShiftTest {
    public static void main(String[] args) {
        int x = 0xAAAA5555; // a negative number (sign bit (msb) = 1)
        int y = 0x55551111; // a positive number (sign bit (msb) = 0)
        System.out.printf("%d%n", x); // -1431677611
        System.out.printf("%d%n", y); // 1431638289
        System.out.printf("%08X%n", x<<1); // 5554AAAAH
        System.out.printf("%08X%n", x>>1); // D5552AAAH
        System.out.printf("%d%n", x>>1); // negative
        System.out.printf("%08X%n", y>>1); // 2AAA8888H
        System.out.printf("%08d%n", y>>1);  // positive
        System.out.printf("%08X%n", x>>>1); // 55552AAAH
        System.out.printf("%d%n", x>>>1); // positive
        System.out.printf("%08X%n", y>>>1); // 2AAA8888H
        System.out.printf("%d%n", y>>>1);  // positive

        // More efficient to use sign-right-right to perform division by 2, 4, 8,...
        int i1 = 12345;
        System.out.println("i1 divides by 2 is " + (i1 >> 1)); 
        System.out.println("i1 divides by 4 is " + (i1 >> 2));
        System.out.println("i1 divides by 8 is " + (i1 >> 3));
        int i2 = -12345;
        System.out.println("i1 divides by 2 is " + (i2 >> 1));
        System.out.println("i1 divides by 4 is " + (i2 >> 2));
        System.out.println("i1 divides by 8 is " + (i2 >> 3));
    }
}

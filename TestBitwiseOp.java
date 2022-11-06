public class TestBitwiseOp {
    public static void main(String[] args) {
        int x = 0xAAAA_5555; // a negative number (sign bit (msb) = 1)
        int y = 0x5555_1111; // a positive number (sign bit (msb) = 0)
        System.out.printf("%d%n", x); // -1431677611
        System.out.printf("%d%n", y); // 1431638289
        System.out.printf("%08X%n", ~x); // 5555AAAAH
        System.out.printf("%08X%n", x & y); // 00001111H
        System.out.printf("%08X%n", x | y); // FFFF5555H
        System.out.printf("%08X%n", x ^ y);  // FFFF4444H
    }
}

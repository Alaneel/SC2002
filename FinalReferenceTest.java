public class FinalReferenceTest {
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("hello"); // final reference of mutable object
        sb.append(", world"); // can change the contents of the referenced object
        System.out.println(sb);
        // hello, world

        // sb = new StringBuffer("world peace");
        // compilation error: cannot assign a value to final veriable xxx

        final int[] numbers = {11, 22, 33};
        numbers[0] = 44;
        System.out.println(java.util.Arrays.toString(numbers));
        // [44, 22, 33]
    }
}
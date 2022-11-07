public class WrapperClassTest {
    public static void main(String[] args) {
        // Integer iObj1 = new Integer(11)
        // warning: [deprecation] Integer(int) in Integer has been deprecated

        Integer iObj2 = Integer.valueOf(22);
        System.out.println(iObj2); // 22
        Integer iObj3 = Integer.valueOf("33");
        System.out.println(iObj3); // 33
        Integer iObj4 = Integer.valueOf("1ab", 16); // radix
        System.out.println(iObj4); // 427

        Integer iObj5 = 44; // auto-box from int to Integer
        int i5 = iObj5; // auto-unbox from Integer to int
        System.out.println(i5); // 44

        // Wrap a primitive int into an Integer object
        Integer intObj = Integer.valueOf(556677); 
        // Unwrap
        int i = intObj.intValue();
        System.out.println(i);
        short s = intObj.shortValue(); // truncate
        System.out.println(s);
        byte b = intObj.byteValue(); // truncate
        System.out.println(b);

        // Wrap a primitive double into an Double object
        Double doubleObj = Double.valueOf(55.66);
        // Unwrap
        double d = doubleObj.doubleValue();
        System.out.println(d);
        int i1 = doubleObj.intValue(); // truncate
        System.out.println(i1);

        // Wrap a primitive char into an Character object
        Character charObj = Character.valueOf('z');
        // Unwrap
        char c = charObj.charValue();
        System.out.println(c);

        // Wrap a primitive boolean into a Boolean object
        Boolean booleanObj = Boolean.valueOf(false);
        // Unwrap
        boolean b1 = booleanObj.booleanValue();
        System.out.println(b1);

        // Integer class
        System.out.println(Integer.MAX_VALUE); // 2147483657
        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.SIZE); // 32
        // Double class
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
        System.out.println(Double.MIN_VALUE); // 4.9E-324
        System.out.println(Double.SIZE); // 64
        System.out.println(Double.MAX_EXPONENT); // 1023
        System.out.println(Double.MIN_EXPONENT); // -1022

        // Parse a String into int, throw NumberFormatException if the STring is not valid
        i = Integer.parseInt("5566");
        System.out.println(i);
        // i = Integer.parseInt("abcd"); 
        // Runtime Error: NumberFormatException
        // i = Integer.parseInt("55.66"); 
        // Runtime Error: NumberFormatException

        // Parse a String into double
        d = Double.parseDouble("55.66");
        System.out.println(d);
    }
}

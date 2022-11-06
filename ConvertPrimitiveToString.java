public class ConvertPrimitiveToString {
    public static void main(String[] args) {
        // Using String concatenation operator '+' with an empty String (applicable to ALL primitive types)
        String str1 = 123 + ""; // int 123 -> String "123"
        System.out.println(str1); 
        String str2 = 12.34 + ""; // double 12.34 -> String "12.34"
        System.out.println(str2);
        String str3 = 'c' + ""; // char 'c' -> String "c"
        System.out.println(str3);
        String str4 = true + ""; // boolean true -> String "true"
        System.out.println(str4);

        // Using String.valueOf(aPrimitive) (applicable to ALL primitive types)
        String str5 = String.valueOf(12345); // int 12345 -> String "12345"
        System.out.println(str5);
        String str6 = String.valueOf(true); // boolean true -> String "true"
        System.out.println(str6);
        String str7 = String.valueOf(55.66); // double 55.66 -> String "55.66"
        System.out.println(str7);

        // Using toString() for each primitive type 
        String str8 = Integer.toString(1234); 
        System.out.println(str8); // int 1234 -> String "1234"
        String str9 = Double.toString(1.23);
        System.out.println(str9); // double 1.23 -> String "1.23"
        String str10 = Character.toString('z');
        System.out.println(str10); // char 'z' -> String "z"
    }
}

public class StringOperations {
    public static void main(String[] args) {
        String str = "Java is cool!";

        System.out.println(str.length()); // return int 13
        System.out.println(str.charAt(2)); // return char 'v'
        System.out.println(str.charAt(5)); // return char 'i'
        System.out.println(str.substring(0, 3)); // return String "Jav"
        System.out.println(str.indexOf('a')); // return int 1
        System.out.println(str.lastIndexOf('a')); // return int 3
        System.out.println(str.endsWith("cool!")); // return boolean true
        System.out.println(str.toUpperCase()); // return a new string "JAVA IS COOL!"
        System.out.println(str.toLowerCase()); // return a new string "java is cool!"

        // Comparing two Strings
        String anotherStr = "Java is COOL!";
        System.out.println(str.equals(anotherStr)); // return boolean false
        System.out.println(str.equalsIgnoreCase(anotherStr)); // return boolean true
        System.out.println(anotherStr.equals(str)); // return boolean false
        System.out.println(anotherStr.equalsIgnoreCase(str)); // return boolean true
        // (str == anotherStr) to compare two Strings is WRONG!!!
    }
}
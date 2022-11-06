/*
 * A Test Driver for the Time class
 */

public class TestTime {
    public static void main(String[] args) {
        // Test Constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1); // toString()
        //03:02:01
        Time t2 = new Time(); // The default constructor
        System.out.println(t2);
        //00:00:00
        Time t3;

        // Case 1: valid input
        // int hour = 23, minute = 58, second = 58
        // Case 2: invalid input
        // int hour = 24, minute = 58, second = 58

        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1); // run toString() to inspect the modified instance
        // 04:05:06
        System.out.println("Hour is: " + t1.getHour());
        // Hour is: 4
        System.out.println("Minute is: " + t1.getMinute());
        // Minute is: 5
        System.out.println("Second is: " + t1.getSecond());
        // Second is: 6

        // Test setTime()
        t1.setTime(58, 59, 23);
        System.out.println(t1);
        // 23:59:58

        // Without try-catch, the program will terminate abruptly if exception thrown
        try {
            t3 = new Time(58, 58, 23);
            // If input is invalid, throw exception. Skip the rest, goto "catch"
            // Else complete "try", skip "catch"
            System.out.println("valid input");
        } catch (IllegalArgumentException ex) {
            // You have the opportunity to do something to recover from the error
            ex.printStackTrace(); // print error messages
            System.out.println("Error in input. Set to default value");
            // You should ask the user to provide the valid input instead!
            t3 = new Time();
        }
        
        // Test nextSecond() and chaining
        System.out.println(t1.nextSecond()); // Return an instance of Time. Invoke Time's toString()
        // 23:59:59
        System.out.println(t1.nextSecond().nextSecond().nextSecond()); // chaining
        // 00:00:02

        System.out.println("Time is " + t3);
        System.out.println("Life goes on...");

        // Case 1 output
        // valid input
        // Time is 23:58:58
        // Life goes on...

        // Case 2 output
        // java.lang.IllegalArgumentException: invalid hour
        // Error in input. Set to default value
        // Time is 00:00:00
        // Life goes on
    }
}

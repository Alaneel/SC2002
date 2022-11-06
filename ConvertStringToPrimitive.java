public class ConvertStringToPrimitive {
    public static void main(String[] args) {
        String intStr = "5566";
        int number = Integer.parseInt(intStr); // number <- 5566
        System.out.println(number);
        // Input to Integer.parseInt() must be a valid integer literal
        
        String floatStr = "55.66";
        float aFloat = Float.parseFloat(floatStr); // aFloat <- 55.66f
        System.out.println(aFloat);
        double aDouble = Double.parseDouble("1.2345"); // aDouble <- 1.2345
        System.out.println(aDouble);
        aDouble = Double.parseDouble("1.2e-3"); // aDouble <- 0.0012
        System.out.println(aDouble);

        String msg = "Hello, world";
        char msgChar;
        for (int idx = 0; idx < msg.length(); ++idx)
        {
            msgChar = msg.charAt(idx);
            System.out.println(msgChar);
        }

        String boolStr = "true";
        boolean done = Boolean.parseBoolean(boolStr); // done <- true
        System.out.println(done);
        boolean valid = Boolean.parseBoolean("false"); // valid <- false
        System.out.println(valid);
    }
}

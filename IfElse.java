public class IfElse {
    public static void main(String[] args) {
        int mark = 50;
        if (mark >= 50) {
            System.out.println("Congratulations!");
            System.out.println("Keep it up!");
        } else {
            System.out.println("Try Harder!"); // curly braces can be omitted if there's only one statement in the block
        }
        System.out.println("Life goes on!");

        double temperature = 80.1;
        if (temperature > 80) {
            System.out.println("Too Hot!");
        } else {
            System.out.println("Too cold!");
        }
        System.out.println("yummy");
    }
}

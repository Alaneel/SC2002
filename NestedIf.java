public class NestedIf {
    public static void main(String[] args) {
        int mark = 62;
        if (mark >= 80) {
            System.out.println("A");
        } else if (mark >= 65) {
            System.out.println("B");
        } else if (mark >= 50) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
        System.out.println("Life goes on!");

        double temperature = 61;
        if (temperature > 80) {
            System.out.println("Too Hot!");
        } else if (temperature > 75) {
            System.out.println("Just right!");
        } else {
            System.out.println("Too Cold");
        }
        System.out.println("Yummy!");
    }
}

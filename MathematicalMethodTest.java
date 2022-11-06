public class MathematicalMethodTest {
    public static void main(String[] args) {
        int secretNumber = (int)(Math.random() * 100); // Generate a random int between 0 and 99
        System.out.println(secretNumber);

        double radius = 5.5;
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println(area);

        int x1 = 1, y1 = 1, x2 = 2, y2 = 2;
        int dx = x2 - x1;
        int dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        System.out.println(distance);
    }
}

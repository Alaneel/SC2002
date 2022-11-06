/*
 * A Test Driver for the Circle class
 */

public class TestCompositionCircle {
    public static void main(String[] args) {
        // Test all constructors and toString()
        CompositionCircle c3 = new CompositionCircle(new Point(4, 5), 6.6); // Use 3rd constructor, an anonymous point instance
        System.out.println(c3); // implicitly run toString()
        CompositionCircle c2 = new CompositionCircle(1, 2, 3.3); // Use 2nd constructor
        System.out.println(c2);
        CompositionCircle c1 = new CompositionCircle(); // Use 1st constructor
        System.out.println(c1);

        // Test Setters and Getters
        c1.setRadius(13.3);
        c1.setCenter(new Point(11, 12));
        System.out.println(c1); // use toString() to inspect the modified instance
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The center is: " + c1.getCenter()); // Point's toString()

        c1.setCenterX(21);
        c1.setCenterY(22);
        System.out.println(c1); // Circle's toString()
        System.out.println("center's x is: " + c1.getCenterX());
        System.out.println("center's y is: " + c1.getCenterY());
        c1.setCenterXY(31, 32);
        System.out.println(c1); // Circle's toString()
        System.out.println("center's x is: " + c1.getCenterXY()[0]);
        System.out.println("center's y is: " + c1.getCenterXY()[1]);

        // Test getArea() and getCircumference()
        System.out.printf("The area is: %.2f%n", c1.getArea());
        System.out.printf("The circumference is: %.2f%n", c1.getCircumference());
        
        // Test distance()
        System.out.printf("distance is: %.2f%n", c1.distance(c2));
        System.out.printf("distance is: %.2f%n", c2.distance(c1));
    }
}

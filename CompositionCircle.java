/*
 * The Circle class composes a "Point" instance as its center and a radius
 * We reuse the "Point" class via composition
 */

public class CompositionCircle {
    // The private member variables
    private Point center; // Declare an intance of the "Point" class
    private double radius;

    // The (overloaded) constructors
    // Constructs a Circle instance with default values
    public CompositionCircle() { // 1st (default) Constructor
        this.radius = 1.0;
        this.center = new Point(); // Construct a Point at (0, 0)
    }
    // Constructs a Circle instance with the center at (xCenter, yCenter) and radius
    public CompositionCircle(int xCenter, int yCenter, double radius) { // 2nd Constructor
        this.radius = radius;
        this.center = new Point(xCenter, yCenter); // Construct a Point at (xCenter, yCenter)
    }
    // Constructs a Circle instance with the given Point instance as center and radius
    public CompositionCircle(Point center, double radius) { // 3rd Constructor
        this.radius = radius;
        this.center = center; // The caller had constructed a Point instance
    }

    // Getters and Setters
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Point getCenter() {
        return this.center; // return a Point instance
    }
    public void setCenter(Point center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX(); // Point's getX()
    }
    public void setCenterX(int x) {
        center.setX(x); // Point's setX()
    }
    public int getCenterY() {
        return center.getY(); // Point's getY()
    }
    public void setCenterY(int y) {
        center.setY(y); // Point's setY()
    }
    public int[] getCenterXY() {
        return center.getXY(); // Point's getXY()
    }
    public void setCenterXY(int x, int y) {
        center.setXY(x, y); // Point's setXY()
    }

    // Returns a self-descriptive string
    public String toString() {
        return "Circle[radius=" + center + ",radius=" + radius + "]"; // invoke center.toString()
    }

    // Returns the area of this circle
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Returns the circumference of this circle
    public double getCircumference() {
        return 2.0 * radius * Math.PI;
    }

    // Returns the distance from the center of this Circle to the center of the given Circle instance called another
    public double distance(CompositionCircle another) {
        return center.distance(another.center); // Use distance() of the Point class
    }
}
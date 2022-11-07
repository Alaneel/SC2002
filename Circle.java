/**
 * The Circle class models circle with a radius and color
 * 
 * @author Alan Wang
 */
public class Circle {

    // The private instance variables
    private double radius;
    private String color;

    /**
     * Constructs a Circle instance with default radius and color 
     */
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Constructed a Circle with Circle()"); // for debugging
    }

    /**
     * Constructs a Circle instance with the given radius and default color
     * @param radius The radius of the circle
     * @param color The color of the circle
     */
    public Circle(double radius) { // 2nd Constructor
        this.radius = radius;
        this.color = "red";
        System.out.println("Constructed a Circle with Circle(radius)"); // for debugging
    }

    /**
     * Constructs a Circle instance with the given radius and color
     * @return The radius of the circle
     */
    public Circle(double radius, String color) { // 3rd Constructor
        this.radius = radius;
        this.color = color;
        System.out.println("Constructed a Circle with Circle(radius, color)"); // for debugging
    }

    /**
     * Return the radius of the circle
     * @return The radius of the circle
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Set the radius of the circle
     * @param radius The radius of the circle to be set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Return the color of the circle
     * @return The color fo the circle
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Set the color of the circle
     * @param color The color of the circle to be set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return a short description of this instance
     * @return A short string description
     */
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

    /**
     * Return the area of the circle
     * @return The area of the circle
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return the circumference of the circle
     * @return The circumference of the circle
     */
    public double getCircumference() {
        return 2.0 * radius * Math.PI;
    }
}
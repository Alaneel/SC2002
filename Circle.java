public class Circle {
    // The private instance variables
    private double radius;
    private String color;

    // The (overloaded) constructors
    // Constructs a Circle instance with default radius and color
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Constructed a Circle with Circle()"); // for debugging
    }
    // Constructs a Circle instance with the given radius and default color
    public Circle(double radius) { // 2nd Constructor
        this.radius = radius;
        this.color = "red";
        System.out.println("Constructed a Circle with Circle(radius)"); // for debugging
    }
    // Constructs a Circle instance with the given radius and color
    public Circle(double radius, String color) { // 3rd Constructor
        this.radius = radius;
        this.color = color;
        System.out.println("Constructed a Circle with Circle(radius, color)"); // for debugging
    }

    // public getter and setters for the private variables
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Returns a self-descriptive string
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

    // Returns the area of this circle
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Returns the circumference of this circle
    public double getCircumference() {
        return 2.0 * radius * Math.PI;
    }
}
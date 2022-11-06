/*
 * A cylinder is a Circle plus a height
 */

public class Cylinder extends Circle {
    // private instance variable
    private double height;

    // Constructors
    public Cylinder() {
        super(); // invoke superclass' constructor Circle()
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()"); // for debugging
    }
    public Cylinder(double height) {
        super(); // invoke superclass' constructor Circle(height)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)"); // for debugging
    }
    public Cylinder(double height, double radius) {
        super(radius); // invoke superclass' constructor Circle(radius)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)"); // for debugging
    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color); // invoke superclass' constructor Circle(radius, color)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)"); // for debugging
    }

    // Getter and Setter
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // Returns the volume of this Cylinder
    public double getVolume() {
        return super.getArea() * height; // Use superclass' getArea()
    }

    // Override the getAreaa() method inherited from superclass Circle
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // Override the inherited toString()
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }
}

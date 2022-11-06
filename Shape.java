/*
 * This abstract superclass Shape contains an abstract method getArea(), tobe implemented by its subclasses
 */

abstract public class Shape {
    // Private member variable
    private String color;

    // Constructs a Shape instance with the given color
    public Shape (String color) {
        this.color = color;
    }

    // Returns a self-descriptive string
    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    // All shape's concrete subclasses must implement a method called getArea()
    abstract public double getArea(); // If the subclass does not provide implementation to all the abstract methods of the superclass, the subclass remians abstract
    // An abstract method cannot be declared final, as final method cannot be overridden
    // An abstract method, on the other hand, must be overriden in a descendant before it can be used
    // An abstract method cannot be private (which generates a compilation error)
    // Thi is because private method are not visible to the subclass and thus cannot be overridden
}

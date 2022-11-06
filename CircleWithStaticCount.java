public class CircleWithStaticCount {
    public static int count = 0; // A static variable to count the number of instances created shared by all the instances, set to public to simplify access
    
    private double radius; // An instance variable for each circle to maintain its own radius
    public CircleWithStaticCount(double radius) { // constructor
        this.radius = radius;
        ++count; // one more instance created
    }

    // Test Driver
    public static void main(String[] args) {
        CircleWithStaticCount c1 = new CircleWithStaticCount(1.1);
        System.out.println(c1.radius);
        // System.out.println("count is: " + c1.count);
        // count is: 1
        // It is recommended to access static variable via the class instead of instances
        System.out.println("count is: " + CircleWithStaticCount.count);
        // count is: 1

        CircleWithStaticCount c2 = new CircleWithStaticCount(2.2);
        System.out.println(c2.radius);
        System.out.println("count is: " + CircleWithStaticCount.count);
        // count is: 2
        // System.out.println("count is: " + c1.count);
        // count is: 2
        // System.out.println("count is: " + c2.count);
        // count is: 2

        CircleWithStaticCount c3 = new CircleWithStaticCount(3.3);
        System.out.println(c3.radius);
        System.out.println("count is: " + CircleWithStaticCount.count);
        // count is: 3
        // System.out.println("count is: " + c1.count);
        // count is: 3
        // System.out.println("count is: " + c2.count);
        // count is: 3
        // System.out.println("count is: " + c3.count);
        // count is: 3
    }
}

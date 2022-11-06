public class StaticCircle {
    public int count = 0; // To count the number of instances created, set to public to simplify access
    private double radius; // private variable
    
    public StaticCircle(double radius) { // constructor
        this.radius = radius;
        ++count;
    }

    // Test Driver
    public static void main(String[] args) {
        StaticCircle c1= new StaticCircle(1.1);
        System.out.println("count is: " + c1.count);
        System.out.println(c1.radius);
        // count is: 1
        StaticCircle c2 = new StaticCircle(2.2);
        System.out.println("count is: " + c2.count);
        System.out.println(c2.radius);
        // count is: 1
        StaticCircle c3 = new StaticCircle(3.3);
        System.out.println("count is: " + c3.count);
        System.out.println(c3.radius);
        // count is: 1
    }
    // This is because count is an instance variable
    // Each instance maintains its own count, when a new instance is constructed, count is initialized to 0, then increment to 1 in the constructor
}

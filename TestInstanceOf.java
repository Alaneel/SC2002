public class TestInstanceOf {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
        Cylinder cy1 = new Cylinder(2.2, 3.3);
        System.out.println(c1 instanceof Circle); // true
        System.out.println(c1 instanceof Cylinder); // false
        System.out.println(cy1 instanceof Cylinder); // true
        System.out.println(cy1 instanceof Circle); // true

        Circle c2 = new Cylinder(4.4, 5.5);
        System.out.println(c2 instanceof Circle); // true
        System.out.println(c2 instanceof Cylinder); // true
    }
}

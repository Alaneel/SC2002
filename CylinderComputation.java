public class CylinderComputation {
    public static void main(String[] args) {
        double radius, height, surfaceArea, baseArea, volume;
        final double PI = 3.1415926;

        radius = 1.5;
        height = 1.5;
        surfaceArea = 2.0 * PI * radius * height + 2.0 * PI * radius * radius;
        baseArea = PI * radius * radius;
        volume = PI * radius * radius * height;

        System.out.print("The radius is ");
        System.out.println(radius);
        System.out.print("The height is ");
        System.out.println(height);
        System.out.print("The surface area is ");
        System.out.println(surfaceArea);
        System.out.print("The base area is ");
        System.out.println(baseArea);
        System.out.print("The volume is ");
        System.out.println(volume);
    }
}

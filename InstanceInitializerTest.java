class Foo {
    int number; // an instance variable
    { // an instance initializer block - run once per instantiation
        System.out.println("running instance initializer...");
        number = 99;
    }
    public Foo() { // Constructor
        System.out.println("running constructor...");
        System.out.println("number is: " + number);
    }
    @Override
    public String toString() {
        return "Running function Foo";
    }
}
public class InstanceInitializerTest {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        System.out.println(f1);
        // running instance initializer
        // running constructor
        // number is: 99
        Foo f2 = new Foo();
        System.out.println(f2);
        // running instance initializer...
        // running constructor
        // number is: 99
    }
}

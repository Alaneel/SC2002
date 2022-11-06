class Foo {
    public int number1 = 11; // explicit initializer
    { // instance initializer
        number1 = 33;
        number2 = 44;
    }
    public int number2 = 22; // explicit initializer

    public Foo() {
        System.out.println("running Foo()...");
    }

    public Foo(int number1, int number2) { // Constructor
        System.out.println("runnning Foo(int, int)...");
        this.number1 = number1; // run after initializers
        this.number2 = number2;
    }
}
public class InstantiationTest {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        // running foo()...
        System.out.println("number1 is " + f1.number1 + ", number2 is " + f1.number2);
        // number1 is 33, number2 is 22
        
        Foo f2 = new Foo(55, 66);
        // running Foo(int, int)...
        System.out.println("number1 is " + f2.number1 + ", number2 is " + f2.number2);
        // number1 is 55, number2 is 66
    }
}

class A {
    private void foo() { // private members are accessible within this class only
        System.out.println("Class A runs private method foo()");
    }
    
    @Override
    public String toString() {
        this.foo();
        return "Hello, world!";
    }
}

class B extends A {
    // @Override
    // compilation error: method does not override or implement a method from a supertype
    public void foo() {
        System.out.println("Class B runs public method foo()");
        // super.foo(); // compilation error: foo() has private access in A
    }
}
public class PrivateInheritanceTest {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1);
        // a1.foo(); // compilation error: foo() has private access in A

        B b1 = new B();
        b1.foo(); // Class B runs public method foo()

        A a2 = new B();
        System.out.println(a2);
        // a2.foo(); // compilation error: foo() has private access in A
        // no polymorphism because foo() is private in A
    }
}

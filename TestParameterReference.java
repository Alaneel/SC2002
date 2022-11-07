public class TestParameterReference {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("In caller, before calling the method, the object is \"" + sb + "\"");
        aMethodOnReference(sb); // invoke method with side-effect
        System.out.println("In caller, after calling the method, the object is \"" + sb + "\"");
    }

    public static void aMethodOnReference(StringBuffer sb) {
        System.out.println("Inside method, the object is \"" + sb + "\"");
        sb.append(", world"); // change parameter
        System.out.println("Inside method, after change, the object is \"" + sb + "\"");
    }
}

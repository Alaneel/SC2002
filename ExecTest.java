public class ExecTest {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("calc.exe");
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        }
    }
}

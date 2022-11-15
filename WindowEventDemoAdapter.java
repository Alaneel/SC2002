import java.awt.*; // Using AWT containers and components
import java.awt.event.*; // Using AWT events classes and listener interfaces

// An AWT GUI program inherits the top-level container java.awt.Frame
public class WindowEventDemoAdapter extends Frame {
    
    private TextField tfCount; // Declare a TextField component
    private Button btnCount; // Declare a Button component
    private int count = 0; // Counter's calue

    // Constructor to setup the GUI components and event handlers
    public WindowEventDemoAdapter() {
        setLayout(new FlowLayout()); // "super" Frame data sets to FlowLayout
        add (new Label("Counter")); // "super" Frame adds an anonymous Label
        tfCount = new TextField("0", 10); // Construct the TextField
        tfCount.setEditable(false); // read-only
        add(tfCount); // "super" Frame adds TextField

        btnCount = new Button("Count"); // Construct the Button
        add(btnCount); // "super" Frame adds Button
        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ++count;
                tfCount.setText(count + "");
            }
        });

        // Allocate an anonymous instance of an anonymous inner class that extends WindowAdapter
        // "super" Frame adds the instance as WindoeEvent listener
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // Terminate the program
            }
        });

        setTitle("WindowEvent Demo"); // "super" Frame sets title
        setSize(300, 100); // "super" Frame sets initial size
        setVisible(true); // "super" Frame shows
    }

    // The entry main() method
    public static void main(String[] args) {
        new WindowEventDemoAdapter(); // Let the construct do the job
    }
}

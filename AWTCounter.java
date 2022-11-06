import java.awt.*; // Using AWT container and component classes
import java.awt.event.*; // Using AWT event classes and listener interfaces

// An AWT program inherits from the top-level container java.awt.Frame

public class AWTCounter extends Frame {
    private Label lblCount; // Declare a Label component
    private TextField tfCount; // Declare a TextField component
    private Button btnCount; // Declare a Button component
    private int count = 0; // Counter's value

    // Constructor to setup GUI components and event handlers
    public AWTCounter () {
        setLayout(new FlowLayout());
        // "super" Frame, which is a Container, sets its layout to Flowlayout to arrange
        // the components from left-to-right, and flow to next row from top-to-bottom

        lblCount = new Label("Counter"); // construct the Label component
        add(lblCount); // "super" Frame container adds Label component

        tfCount = new TextField(count + "", 10); // construct the TextField component with initial text
        tfCount.setEditable(false); // set to read-only
        add(tfCount); // "super" Frame container adds TextField component

        btnCount = new Button("Count"); // construct the Button component
        add(btnCount); // "super" Frame container adds Button component

        BtnCountListener listener = new BtnCountListener();
        btnCount.addActionListener(listener);
            // "btnCount" is the source object that fires an ActionEvent when clicks
            // The source object adds an instance of BtnCountListener as an ActionEvent listener
            // which provides an ActionEvent handler called actionPerformed()
            // Clicking "Count" button calls back actionPerformed()

        setTitle("AWT Counter"); // "super" Frame sets its title
        setSize(300, 100); // "super" Frame sets its ititial window size

        System.out.println(this);
        //AWTCounter[frame0,93,0,300x100,invalid,hidden,layout=java.awt.FlowLayout,title=AWT Counter,resizable,normal]
            // name (assigned by compiler) is "frame0"; top-left (x,y) at (93,0); width/height is 300x100 (via setSize());
        System.out.println(lblCount);
        //java.awt.Label[label0,0,0,0x0,invalid,align=left,text=Counter]
            // name is "Label0"; align is "Label.LEFT" (default); text is "Counter" (assigned in constructor)
        System.out.println(tfCount);
        //java.awt.TextField[textfield0,0,0,0x0,invalid,text=0,selection=0-0]
            // name is "Textfield0"; text is "0" (assigned in constructor)
        System.out.println(btnCount);
        //java.awt.Button[button0,0,0,0x0,invalid,label=Count]
            // name is "button0"; label text is "Count" (assigned in constructor)

        setVisible(true);  // "super" Frame shows

        System.out.println(this);
        //AWTCounter[frame0,93,0,300x100,invalid,layout=java.awt.FlowLayout,title=AWT Counter,resizable,normal]
        System.out.println(lblCount);
        //java.awt.Label[label0,31,35,57x23,align=left,text=Counter]
        System.out.println(tfCount);
        //java.awt.TextField[textfield0,93,35,124x23,text=0,selection=0-0]
        System.out.println(btnCount);
        //java.awt.Button[button0,222,35,46x23,label=Count]
    }

    // The entry main() method
    public static void main(String[] args) {
        // Invoke the constructor to setup the GUI, by allocating an instance
        AWTCounter app = new AWTCounter(); // or simply "new AWTCounter();" for an anonymous instance
        System.out.println(app);
    }

    // Define an inner class to handle the "Count" button-click
    private class BtnCountListener implements ActionListener {
        // ActionEvent handler - Called back upon button-click
        @Override
        public void actionPerformed(ActionEvent evt) {
            ++count; // Increase the counter value
            // Display the counter value on the TextField tfCount
            tfCount.setText(count + ""); // Convert int to String
        }
    }
}

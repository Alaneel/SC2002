import java.awt.*;
import java.awt.event.*;

// An AWT GUI program inherits the top-level container java.awt.Frame
public class AWTCounter3ButtonsGetSource extends Frame {
    private TextField tfCount;
    private Button btnCountUp, btnCountDown, btnReset;
    private int count = 0;

    // Constructor to setup the GUI components and event handlers
    public AWTCounter3ButtonsGetSource() {
        setLayout(new FlowLayout());
        add(new Label("Counter")); // an anonymous instance of Label
        tfCount = new TextField("0", 10);
        tfCount.setEditable(false); // read-only
        add(tfCount); // "super" Frame adds tfCount

        btnCountUp = new Button("Count Up");
        add(btnCountUp);
        btnCountDown = new Button("Count Down");
        add(btnCountDown);
        btnReset = new Button("Reset");
        add(btnReset);
        
        // Allocate an instance of the "named" inner class BtnListener
        AllButtonsListener listener = new AllButtonsListener();
        // Use the same listener instance for all the 3 Buttons
        btnCountUp.addActionListener(listener);
        btnCountDown.addActionListener(listener);
        btnReset.addActionListener(listener);

        setTitle("AWT Counter");
        setSize(400, 100);
        setVisible(true);
    }

    // The entry main() method
    public static void main(String[] args) {
        new AWTCounter3ButtonsGetSource(); // Let the constructor do the job
    }

    /*
     * AllButtonsListener is an named inner class used as ActionEvent listener for all the Buttons
     */
    private class AllButtonsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            // Need to determine which button fired the event 
            Button source = (Button)evt.getSource();
            // Get a reference which button has fired the event
            // getSource() returns a java.lang.Object. Downcast back to Button
            if (source == btnCountUp) {
                ++count;
            } else if (source == btnCountDown) {
                --count;
            } else {
                count = 0;
            }
            tfCount.setText(count + "");
        }
    }
}

// ButtonEventDemo.java
// Demonstrates Java GUI button click event handling using Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventDemo extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    int clickCount = 0;

    ButtonEventDemo() {
        // Setting up the frame
        setTitle("Button Event Handling Demo");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Creating components
        button = new JButton("Click Me");
        label = new JLabel("Button not clicked yet");

        // Registering the event listener on the button
        button.addActionListener(this);

        // Adding components to the frame
        add(button);
        add(label);

        setVisible(true);
    }

    // This method is called automatically whenever the button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        clickCount++;
        label.setText("Button clicked " + clickCount + " time(s)");
    }

    public static void main(String[] args) {
        new ButtonEventDemo();
    }
}

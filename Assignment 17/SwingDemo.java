// SwingDemo.java
// Demonstrates the use of Swing to create a simple GUI window

import javax.swing.*;
import java.awt.*;

public class SwingDemo {
    public static void main(String[] args) {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("Swing Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create Swing components
        JLabel label = new JLabel("Hello, this is a Swing demo!");
        JButton button = new JButton("Click Me");
        JTextField textField = new JTextField(15);

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Make the window visible
        frame.setVisible(true);
    }
}

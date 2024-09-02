import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleGUI {

    // Method to create and show the GUI
    private static void createAndShowGUI() {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set the size of the window

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Create a JLabel and add it to the panel
        JLabel label = new JLabel("Hello, World!");
        panel.add(label);

        // Create a JButton and add it to the panel
        JButton button = new JButton("Click Me!");
        panel.add(button);

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change the text of the label when the button is clicked
                label.setText("Button Clicked!");
            }
        });

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Make the window visible
        frame.setVisible(true);
    }

    // Main method to run the GUI
    public static void main(String[] args) {
        // Schedule the GUI creation to be done on the Event Dispatch Thread (EDT)
        javax.swing.SwingUtilities.invokeLater(SimpleGUI::createAndShowGUI);
    }
}

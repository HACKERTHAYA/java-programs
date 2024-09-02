import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
0
public class ButtonClickExample {

    // Method to create and show the GUI
    private static void createAndShowGUI() {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Button Click Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set the size of the window

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Create a JLabel and add it to the panel
        JLabel label = new JLabel("Click the button below:");
        panel.add(label);

        // Create a JButton and add it to the panel
        JButton button = new JButton("Click Me!");
        panel.add(button);

        // Create an ActionListener for the button
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change the text of the label when the button is clicked
                label.setText("Button was clicked!");
            }
        };

        // Register the ActionListener with the button
        button.addActionListener(buttonListener);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Make the window visible
        frame.setVisible(true);
    }

    // Main method to run the GUI
    public static void main(String[] args) {
        // Schedule the GUI creation to be done on the Event Dispatch Thread (EDT)
        javax.swing.SwingUtilities.invokeLater(ButtonClickExample::createAndShowGUI);
    }
}

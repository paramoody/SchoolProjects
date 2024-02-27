import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reply {
	public static void main(String[] args) {

// Construct the JFrame object
		JFrame appFrame = new JFrame();
		appFrame.setSize(400, 200);

// Title
		appFrame.setTitle("This is Definitly a Title");
//Button
		JButton button = new JButton();
		button.setText("Ceci n'est pas une bouton");
		
		JLabel label = new JLabel("This is definitly a label (fully centered)");
// Create a JPanel with FlowLayout and center alignment
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.add(label);
		panel.add(button);
// Add the JPanel to the JFrame
		appFrame.add(panel);
// Close
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		appFrame.setVisible(true);
	}
}
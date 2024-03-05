import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Reply {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		JButton lb = new JButton("Left");
		panel.add(lb, BorderLayout.WEST);
		
		JButton rb = new JButton("Right");
		panel.add(rb, BorderLayout.EAST);
		
		JButton mb = new JButton("Middle");
		panel.add(mb, BorderLayout.CENTER);
		
		//frame.setSize(500, 500);
		
		frame.add(panel);
		frame.pack();
		
		
		
		frame.setVisible(true);
	}
}
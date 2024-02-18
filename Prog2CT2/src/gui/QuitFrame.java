package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class QuitFrame extends JFrame {
	JLabel label;
	JPanel panel;
	QuitFrame(double balance){
		label = new JLabel("Final Balance: " + balance);
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(200, 40));
		this.add(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		panel.add(label);
		this.pack();
	}

}

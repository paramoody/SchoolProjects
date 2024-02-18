package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WelcomeFrame extends JFrame implements ActionListener {
	WelcomeFrame welcomeFrame;
	JPanel panel;
	JTextField textField;
	JButton button;
	double count;
	WelcomeFrame(){
		button = new JButton("Enter account balance");
		button.addActionListener(this);
		panel = new JPanel();
		textField = new JTextField("0");
		textField.setPreferredSize(new Dimension(250, 40));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		panel.add(textField);
		this.add(panel);
		this.add(button);
		this.pack();
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			count = Double.parseDouble(textField.getText());
			new MyFrame(count);
			dispose();
			
		}
	}

}

package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JButton depositButton;
	JButton withdrawButton;
	JButton quitButton;
	JTextField textField;
	JPanel panel;
	JLabel label;
	double count = 0;

	MyFrame(double initialCount) {

		// this.count = count;
		final double[] count = { initialCount };

		String countStr = "Balance: " + Double.toString(count[0]);
		label = new JLabel(countStr);

		panel = new JPanel();
		panel.setSize(200, 50);
		panel.add(label);

		depositButton = new JButton("Deposit");
		withdrawButton = new JButton("Withdraw");
		quitButton = new JButton("Quit");
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));

		depositButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == depositButton) {
					count[0] += Double.parseDouble(textField.getText());
				}
				String newCountStr = "Balance: " + Double.toString(count[0]);
				label.setText(newCountStr);
				textField.setText("");
				pack();
			}
		});

		withdrawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == withdrawButton) {
					count[0] -= Double.parseDouble(textField.getText());
				}
				String newCountStr = "Balance: " + Double.toString(count[0]);
				label.setText(newCountStr);
				textField.setText("");
				pack();
			}
		});

		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == quitButton) {
					new QuitFrame(count[0]);
					dispose();
				}
			}
		});

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.setLayout(new FlowLayout());
		this.add(panel);

		panel.add(textField);
		// textField.set
		panel.add(depositButton);
		panel.add(withdrawButton);
		panel.add(quitButton);
		this.pack();
		this.setVisible(true);

	}

}

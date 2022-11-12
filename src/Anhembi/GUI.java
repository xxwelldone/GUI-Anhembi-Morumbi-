package Anhembi;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI {

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);
		// user****************************************************************
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		// Inside the constructor is the length of characters
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);

		// password****************************************************************

		JLabel passwordlabel = new JLabel("Password");
		passwordlabel.setBounds(10, 50, 80, 25);
		panel.add(passwordlabel);
		
		JPasswordField pwField = new JPasswordField("TypeHere");
		pwField.setBounds(100, 50, 165, 25);
		panel.add(pwField);

		// button****************************************************************
		JButton button = new JButton ("Login");
		button.setBounds(10, 80, 80, 25);
		panel.add(button);
		
		frame.setVisible(true);

	}

}

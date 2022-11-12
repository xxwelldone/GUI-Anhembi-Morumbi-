package Anhembi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordlabel;
	private static JPasswordField pwField;

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		panel.setLayout(null);
		// user****************************************************************
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		// Inside the constructor is the length of characters
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);

		// password****************************************************************

		passwordlabel = new JLabel("Password");
		passwordlabel.setBounds(10, 50, 80, 25);
		panel.add(passwordlabel);
		
		pwField = new JPasswordField("TypeHere");
		pwField.setBounds(100, 50, 165, 25);
		panel.add(pwField);

		// button****************************************************************
		JButton button = new JButton ("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		// Sucess ***
		JLabel sucess = new JLabel("");
		sucess.setBounds(10, 110, 300, 25);
		panel.add(sucess);
		
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		}
		
	}

}

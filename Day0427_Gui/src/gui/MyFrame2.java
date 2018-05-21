package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class MyFrame2 extends JFrame{
	private JTextField textField;
	public MyFrame2() {
		this.setSize(500, 293);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(325, 24, 97, 23);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(43, 25, 256, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(43, 63, 379, 177);
		panel.add(textArea);
		
		this.setVisible(true);
		
	}
}

package view;

import javax.swing.*;
import model.Value;
import java.awt.event.*;
import control.AddControl;

public class Application extends JFrame {
	Value val;
	JButton addButton;
	JTextField text;

	public Application(Value v) {
		v = val;
		initialize();

	}

	public JButton getButton() {
		return addButton;
	}

	public JTextField getTextField() {
		return text;
	}

	public void initialize() {
		setTitle("Hello World");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 100);
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		
		text = new JTextField(10);
		contentPane.add(text);
		
		addButton = new JButton("Add 1");
		contentPane.add(addButton);
		
		addButton.addActionListener(new AddControl(val, this));

	}

}

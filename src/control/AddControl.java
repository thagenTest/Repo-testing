package control;

import model.Value;
import view.Application;
import javax.swing.*;
import java.awt.event.*;

public class AddControl implements ActionListener {
	Value val;
	Application app;

	public AddControl(Value v, Application a) {
		val = v;
		app = a;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField tf = app.getTextField();

		int num = Integer.parseInt(tf.getText());
		int newNum = num + 1;
		
		Value.
		
		
	}

}

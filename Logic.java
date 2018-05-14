import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class Logic {

	int labelCounter =  0;

	public void addNew(JLabel label[], JTextField addNewText) {
		if (addNewText.getText().toString().contains("Enter item name") || addNewText.getText().toString().contains("")) {
			System.out.println("Error: No input given");
		}
		else {
			label[labelCounter].setText(addNewText.getText());
			labelCounter++;
		}
	}	


	public void clearAll(JLabel label[]) {
		for (int i = 0; i < labelCounter; i++) {
			label[i].setText("");
		}

		labelCounter = 0;

	}

}



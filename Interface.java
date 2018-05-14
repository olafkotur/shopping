import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Interface implements ActionListener {

	Logic logic = new Logic();

	JTextField addNewText = new JTextField("Enter item name", 40);

	JButton addUsual = new JButton("Usual Items");
	JButton addChorizo = new JButton("Chorizo Pasta");
	JButton addWraps = new JButton("Chicken Wraps");
	JButton addSweet = new JButton("Sweet and Sour Chicken");
	JButton addCurry = new JButton("Chicken Curry");
	JButton addBake = new JButton("Pasta Bake");
	JButton addNew = new JButton("Add New");
	JButton clear = new JButton("Clear All");
	JButton delete = new JButton("Delete Selected");

	JLabel label[] = new JLabel[15];

	public Interface() {

		JFrame frame = new JFrame();

		// Main panel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(1, 2, 0, 0));
		mainPanel.setBackground(Color.BLACK);


		// List panel
		JPanel listPanel = new JPanel();
		listPanel.setLayout(new GridLayout(15, 1, 0, 0));
		listPanel.setBackground(Color.WHITE);

		
		for (int i = 0; i < 15; i++) {
			label[i] = new JLabel("");
			listPanel.add(label[i]);
		}


		// Selection panel
		JPanel selectionPanel = new JPanel();
		selectionPanel.setLayout(new GridLayout(5, 2, 0, 0));
		selectionPanel.setBackground(Color.WHITE);

		addNewText.setHorizontalAlignment(JTextField.CENTER);
		addNewText.setForeground(Color.GRAY);
		addNewText.setFont(new Font("", Font.ITALIC, 13));

		clear.setForeground(Color.RED);
		delete.setForeground(Color.RED);

		addNew.addActionListener(this);
		addUsual.addActionListener(this);
		addChorizo.addActionListener(this);
		addWraps.addActionListener(this);
		addSweet.addActionListener(this);
		addCurry.addActionListener(this);
		addBake.addActionListener(this);
		clear.addActionListener(this);
		delete.addActionListener(this);

		selectionPanel.add(addNewText);
		selectionPanel.add(addNew);
		selectionPanel.add(addUsual);
		selectionPanel.add(addChorizo);
		selectionPanel.add(addWraps);
		selectionPanel.add(addSweet);
		selectionPanel.add(addCurry);
		selectionPanel.add(addBake);
		selectionPanel.add(clear);
		selectionPanel.add(delete);


		// Adding panels to main
		mainPanel.add(listPanel);
		mainPanel.add(selectionPanel);


		// Frame properties
		frame.setResizable(false);
		frame.setSize(800, 600);
		frame.setContentPane(mainPanel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public void actionPerformed(ActionEvent e) {

		// Add new button
		if (e.toString().contains("Add New")) {
			logic.addNew(label, addNewText);
		}


		// Usual items button
		if (e.toString().contains("Usual Items")) {
		}


		// Chorizo pasta button
		if (e.toString().contains("Chorizo Pasta")) {
		}


		// Chicken wraps button
		if (e.toString().contains("Chicken Wraps")) {
		}

		
		// Sweet and sour chicken button
		if (e.toString().contains("Sweet and Sour Chicken")) {
		}


		// Pasta bake button
		if (e.toString().contains("Pasta Bake")) {
		}


		// Clear all button
		if (e.toString().contains("Clear All")) {
			logic.clearAll(label);
		}


		// Delete selected button
		if (e.toString().contains("Delete Selected")) {
		}

	}

}
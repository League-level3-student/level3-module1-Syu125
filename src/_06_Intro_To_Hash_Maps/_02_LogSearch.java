package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons.
	 * 
	 * Button 1: Add Entry When this button is clicked, use an input dialog to ask
	 * the user to enter an ID number. After an ID is entered, use another input
	 * dialog to ask the user to enter a name. Add this information as a new entry
	 * to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	HashMap<Integer, String> h1 = new HashMap<Integer, String>();
	ArrayList<Integer> identification = new ArrayList<Integer>();

	static JFrame f1 = new JFrame();
	static JPanel p1 = new JPanel();
	static JButton b1 = new JButton();
	static JButton b2 = new JButton();
	static JButton b3 = new JButton();
	int id = 0;
	int ID = 0;
	int check = 0;
	String name = "";
	String list = "";

	public static void main(String[] args) {
		_02_LogSearch ls = new _02_LogSearch();
		ls.run();
	}

	void run() {

		f1.setVisible(true);
		p1.setVisible(true);
		b1.setVisible(true);
		b2.setVisible(true);
		b3.setVisible(true);
		b1.setText("Add");
		b2.setText("Find");
		b3.setText("List");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		f1.add(p1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		f1.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			id = Integer.parseInt(JOptionPane.showInputDialog("Please enter your ID number."));
			name = JOptionPane.showInputDialog("Please enter your name");
			h1.put(id, name);
			identification.add(id);
		}
		if (e.getSource() == b2) {
			ID = Integer.parseInt(JOptionPane.showInputDialog("Please enter a valid ID."));
			if (h1.get(ID) != null) {
				JOptionPane.showMessageDialog(null, "Name: " + h1.get(ID));
			} else {
				JOptionPane.showMessageDialog(null, "INVALID");
			}
		}
		if (e.getSource() == b3) {
			for (int i = 0; i < h1.size(); i++) {
				check = identification.get(i);
				list += check + ": " + h1.get(check) + "\n";
			}
			JOptionPane.showMessageDialog(null, list);
		}
	}
}

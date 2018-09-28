package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements MouseListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	static JFrame f1 = new JFrame();
	static JPanel p1 = new JPanel();
	static JButton b1 = new JButton();
	static JButton b2 = new JButton();	
	int count = 0;
	String [] names = new String[10];

	
	public static void main(String[] args) {
	_02_GuestBook gb = new _02_GuestBook();
	gb.setup();
	}
void setup() {
	f1.add(p1);
	p1.add(b1);
	p1.add(b2);
	
	f1.setVisible(true);
	p1.setVisible(true);
	b1.setVisible(true);
	b2.setVisible(true);
	
	b1.setText("Add Name");
	b2.setText("View Names");
	b1.addMouseListener(this);
	b2.addMouseListener(this);
	
	f1.pack();
}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1) {
			names[count] = JOptionPane.showInputDialog(null, "Add a name.");
			count+=1;
		}
		if(e.getSource() == b2) {
			for(int i = 0; i < count; i++) {
				System.out.println( "Guest #" + (i + 1) + ": " + names[i]);
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

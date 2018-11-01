package _03_IntroToStacks;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.stream.events.Characters;

public class _02_TextUndoRedo implements KeyListener {
	static char key;
	static char key2;
	JFrame f1 = new JFrame();
	JPanel p1 = new JPanel();
	JLabel l1 = new JLabel();
	static Stack<Character> c = new Stack<Character>();

	public static void main(String[] args) {
		_02_TextUndoRedo program = new _02_TextUndoRedo();
		program.run();
	}

	void run() {
		f1.add(p1);
		f1.setSize(500, 500);
		p1.add(l1);
		JOptionPane.showMessageDialog(null, "Hello! Welcome to the Typing Pad! Here, you can jot down anything you wish to write.\nIf you accidentally delete all your writing, you can click the 'Enter' button to undo.");
		f1.setVisible(true);
		p1.setVisible(true);
		l1.setVisible(true);
		f1.addKeyListener(this);
	}
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		key = e.getKeyChar();
		if (key != KeyEvent.VK_BACK_SPACE && key != KeyEvent.VK_ENTER) {
			l1.setText(l1.getText() + key);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			c.push(l1.getText().charAt(l1.getText().length()-1));
			l1.setText(l1.getText().substring(0, l1.getText().length() - 1));
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			key2 = c.pop();
			l1.setText(l1.getText() + key2);

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	Stack<String> answers = new Stack<String>();
	JLabel [] labels;
	String word;
	String letter;
	JFrame f = new JFrame();
	JPanel p = new JPanel();

	public static void main(String[] args) {
		HangMan hm = new HangMan();
		hm.startup();
		hm.play();
	}

	void startup() {
		String words = JOptionPane.showInputDialog(
				"Hello, welcome to Hangman! How many words would you like to guess? \n(Remember, you lose if you run out of lives)");
		int w = Integer.parseInt(words);
		for (int i = 0; i < w; i++) {
			word = Utilities.readRandomLineFromFile("dictionary.txt");
			answers.push(word);
		}
	}

	void play() {
		String Word = answers.pop();
		int characters = Word.length();
		labels = new JLabel [characters];
		f.add(p);
		
		f.setVisible(true);
		p.setVisible(true);
		for(int i = 0; i < characters; i++) {
			System.out.println("hi");
			p.add(labels[i]);
			labels[i].setVisible(true);
			labels[i].setText("_ ");
			
		}
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		letter = String.valueOf(e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

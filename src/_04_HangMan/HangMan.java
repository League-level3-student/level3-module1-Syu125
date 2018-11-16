package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	Stack<String> answers = new Stack<String>();
	JLabel[] labels;
	JLabel[] labels2;
	String word;
	Character letter;
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	Character[] c;
	int count;
	int characters;
	Character [] overlap;

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
		word = answers.pop();
		characters = word.length();
		labels = new JLabel[characters];
		labels2 = new JLabel[characters];
		f.add(p);
		f.setVisible(true);
		p.setVisible(true);
		f.addKeyListener(this);
		c = new Character[characters];	
		System.out.println(characters);
		for (int i = 0; i < characters; i++) {
			labels[i] = new JLabel();
			labels2[i] = new JLabel();
			p.add(labels[i]);
			c[i] = word.charAt(i);
			labels2[i].setText(c[i].toString());
			labels[i].setText("_");	
			labels[i].setVisible(true);
		
		}
		f.pack();
	}

	void match() {

	}

	@Override
	public void keyTyped(KeyEvent e) {
	
		// TODO Auto-generated method stub
	
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	letter = e.getKeyChar();
	overlap = new Character[characters];
		for (int i = 0; i < characters; i++) {
			if (letter.equals(c[i])) {
			overlap[i] = new Character(letter);
				labels[i].setText(labels2[i].getText());
				System.out.println("hi");
				for(int j = 0; j < characters; j++) {
				if(!letter.equals(overlap[i])) {
					count+=1;
				}
				}
			}
				
			if(count == characters) {
				play();
			}
		}

	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

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
	ArrayList<Character> alph = new ArrayList<Character>();
	JLabel[] labels;
	JLabel[] labels2;
	JLabel lives;
	String word;
	Character letter;
	Character Let;
	Character l;
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	Character[] c;
	int count;
	int characters;
	int life;
	Character[] overlap;
	static Boolean fake;
	static Boolean correct;

	public static void main(String[] args) {
		HangMan hm = new HangMan();
		hm.startup();
		hm.play();
		fake = false;
		correct = false;
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
		life = 10;
		characters = word.length();
		labels = new JLabel[characters];
		labels2 = new JLabel[characters];
		lives = new JLabel();
		lives.setText("     Lives: " + life);
		f.add(p);
		p.add(lives);
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
		p.add(lives);
		lives.setVisible(true);
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
		fake = true;
		letter = e.getKeyChar();
		overlap = new Character[characters];
		alph.add(letter);
		for (int i = 0; i < characters; i++) {
			if (letter.equals(c[i])) {
				overlap[i] = new Character(letter);
				fake = false;

				for (int k = 0; k < alph.size(); k++) {
					System.out.println("hi");
					if (!letter.equals(alph.get(k))) {

						for (int j = 0; j < characters; j++) {

							if (!letter.equals(overlap[j])) {
								labels[i].setText(labels2[i].getText());
								correct = true;
							} else {
							}
						}
					}
				}

			}
		}

		if (count == characters) {
			for (int k = 0; k < characters; k++) {
				p.remove(labels[k]);
				p.remove(labels2[k]);
				p.remove(lives);
				f.remove(p);
				lives.removeAll();
			}
			count = 0;
			p.remove(lives);
			life = 10;
			play();
			fake = true;

		}
		if (fake) {
			life -= 1;
			lives.setText("     Lives: " + life);
			if (life == 0) {
				lives.setText("     Lives: " + life);
				JOptionPane.showMessageDialog(null, "GAME OVER");
				f.dispose();
			}
		}
		if (correct) {
			count += 1;
			correct = false;
			System.out.println(count);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

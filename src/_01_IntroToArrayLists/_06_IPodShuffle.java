package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b= new JButton();
	public _06_IPodShuffle(){
		// 1. Use the Song class to play the demo.mp3 file.
			
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		
		Song Ca = new Song("demo.mp3");
		Song Cb = new Song("Cc.wav");
		Song Cc = new Song("");
		Song Cd = new Song("");
		Song Ce = new Song(""); 
		_06_IPodShuffle iPod = new _06_IPodShuffle();
		iPod.run();
		ArrayList<Song> songs = new ArrayList<Song>();
		songs.add(Ca);
		songs.add(Cb);
		songs.add(Cc);
		songs.add(Cd);
		songs.add(Ce);
		Cb.play();
		
	}
	void run() {
	
		Random r = new Random();
		int playSong = r.nextInt(5);
		
		f.add(p);
		p.add(b);
		f.setVisible(true);
		p.setVisible(true);
		b.setVisible(true);
		b.setText("Surprise Me!");
		b.addActionListener(this);
		f.pack();
	}
	void songPlay() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			
		}
	}
}
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
	Song play;
	Random r = new Random();	
	ArrayList<Song> songs = new ArrayList<Song>();
int playSong = r.nextInt(5);
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
		_06_IPodShuffle iPod = new _06_IPodShuffle();
		iPod.run();
		iPod.song();
	}
	void run() {
	
		f.add(p);
		p.add(b);
		f.setVisible(true);
		p.setVisible(true);
		b.setVisible(true);
		b.setText("Surprise Me!");
		b.addActionListener(this);
		f.pack();
		
		songs.add(new Song("demo.mp3"));
		songs.add(new Song("187950__soundmatch24__rnb-beat.mp3"));
		songs.add(new Song("425556__planetronik__rock-808-beat.mp3"));
		songs.add(new Song("72104__dustkut__click-beat-1.mp3"));
		songs.add(new Song("440059__nerdychick1217__magix-beat-3.mp3"));
		
	}
	void song() {
	
		
	playSong = r.nextInt(5);
	play = songs.get(playSong);
}
	

	void songPlay() {
			play.play();
	}
	void stopSong() {
		play.stop();
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			stopSong();
			song();
			songPlay();
			
			}
		}
	}

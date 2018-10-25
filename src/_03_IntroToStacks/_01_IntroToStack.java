package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _01_IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> s = new Stack<Double>();
		Random r = new Random(100);
		Double d;

		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			r = new Random();
			d = r.nextDouble();
			d *= 100;
			s.push(d);
		}
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String a = JOptionPane.showInputDialog("Enter a number in between 0 and 100");
		String b = JOptionPane
				.showInputDialog("Enter another number in between 0 and 100, that is greater than the first number");

		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);

		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.
		for (int j = 0; j < 100; j++) {
			Double p = s.pop();
			if (p > aa && p < bb) {
				System.out.println(p);
			}

		}

		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}

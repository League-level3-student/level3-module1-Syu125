package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.event.KeyEvent;
import java.util.Stack;

import javax.swing.JOptionPane;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<String> bracket = new Stack<String>();
		for (int i = 0; i < b.length(); i++) {
			String b1 = String.valueOf(b.charAt(i));
			if (b1.equals("{")) {
				bracket.push(b1);
			}else if (b1.equals("}")) {
				if(!bracket.isEmpty()) {
				bracket.pop();
				}else {
					return false;
				}
			}
		}
		return bracket.isEmpty();
	}

}
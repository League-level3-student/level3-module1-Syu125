package _01_IntroToArrayLists;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		String[] s = new String[5];
		// Don't forget to import the ArrayList class

		// 2. Add five Strings to your list
		for (int i = 0; i < 5; i++) {
			s[i] = new String();
		}
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		// 4. Print all the Strings using a for-each loop
		for (String name : s) {
			System.out.println(name);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < s.length; i++) {
			if (i % 2 == 0) {
				System.out.println(s[i]);
			}
		}
		// 6. Print all the Strings in reverse order.
		for (int i = s.length; i > 1; i--) {
			System.out.println(s[i]);
		}

		// 7. Print only the Strings that have the letter 'e' in them.
	}
}

package _05_String_Integer_Pair;

public class StringIntegerPair {
	// 1. create a private array of Strings called keys. Don't initialize it.
	private String[] keys;
	// 2. create a private array of integers called values.
	private int[] values;

	StringIntegerPair() {
		// 3. initialize both member arrays to a length of 0
		keys = new String[0];
		values = new int[0];

	}

	// 4. Complete the steps in the put method
	public void put(String key, int value) {
		// A. iterate through the keys. If you find a key that matches
		// the passed in String, set the value at that location to the
		// passed in value and return from the method.
		for (int i = 0; i < keys.length; i++) {
			System.out.println(i);
			if (keys[i].equals(key)) {
				keys[i].equals(key);

			}
		}
		// B. create a String array that is one element longer than the keys
		String[] s = new String[keys.length + 1];
		// C. create an integer array that is one element longer than values
		int[] i = new int[values.length + 1];
		// D. set the last element of the new String array to the passed in key
		s[keys.length] = key;
		// E. set the last element of the new int array to the passed in value
		i[values.length] = value;
		// F. iterate through the keys and values and copy the elements to the new
		// arrays

		for (int j = 0; j < keys.length; j++) {
			s[j] = new String();
			s[j].equals(keys[j]);
		}
		for (int k = 0; k < values.length; k++) {
			i[k] = values[k];
		}
		// G. Set the keys and values arrays equal to the new arrays created in steps B
		// and C.
		for (int p = 0; p < keys.length; p++) {
			keys[p].equals(s[p]);
		}
		for (int t = 0; t < values.length; t++) {
			values[t] = i[t];
		}
	}

	// 5. Complete the method so it returns the value located at the passed in key.
	// If the key does not exist, return Integer.MIN_VALUE.
	public int get(String key) {

		Integer store = key.indexOf(key);
		if (key.isEmpty()) {
			return Integer.MIN_VALUE;
		}
		return store;

	}

	// 6. Complete the containsKey method so that it returns true if the
	// passed in key is contained in the keys array
	public boolean containsKey(String key) {

		for (int g = 0; g < keys.length; g++) {
			if (key.equals(keys[g])) {
				return true;
			}
		}
		return false;
	}

	// 7. Complete the containsValue method so that it returns true if the
	// passed in value is contained in the values array
	public boolean containsValue(int value) {
		for (int l = 0; l < values.length; l++) {
			if (values[l] == value) {
				return true;
			}
			return false;
		}
		return false;
	}

	// 8. Complete the getKeysMethod so it returns the keys as an array
	public String[] getKeys() {

		return keys;

	}

	// 9. Complete the getKeysMethod so it returns the values as an array
	public int[] getValues() {

		return values;
	}
}

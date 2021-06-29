package Practice;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingExcercise {
	public static String input = "ACGTCA";
	public static List<String> data = new ArrayList<String>();
	public static List<Character> characters = new ArrayList<Character>();
	public static int match = Integer.MIN_VALUE;
	public static int randChar = Integer.MIN_VALUE;

	public static void main(String[] args) {
		while (true) {
			StringBuilder output = new StringBuilder(input.length());
			intializer();

			while (!characters.isEmpty()) {
				randChar = (int) (Math.random() * characters.size());
				output.append(characters.remove(randChar));
			}
			if (data.contains(output.toString()) == false) {
				if (data.isEmpty()) {
					data.add(output.toString());
				} else {
					match = matching(data.get(data.size() - 1), output.toString());
					if ((input.length() - match) >= 3) {
						if (data.size() == 96) {
							break;
						} else {
							data.add(output.toString());
						}
					}
				}

			}
		}
		
		printListAndSize();
	}

	static void printListAndSize() {
		System.out.println(data.toString());
		System.out.println("Words: " + data.size());
	}

	static void intializer() {
		for (char c : input.toCharArray()) {
			characters.add(c);
		}
	}

	static int matching(String str, String str2) {
		int matches = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str2.charAt(i)) {
				matches++;
			}
		}
		return matches;
	}

	@Override
	public String toString() {
		return "ProgrammingExcercise [toString()=" + super.toString() + "]";
	}

}

package Practice;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingExcercise {
	public static String input = "ATCGTC";
	public static List<String> data = new ArrayList<String>();

	public static void main(String[] args) {
		permuteCharacets(input, 0, input.length() - 1);
		printListAndSize();
	}

	static void printListAndSize() {
		System.out.println(data.toString());
		System.out.println("Words: " + data.size());
	}

	private static void permuteCharacets(String input, int l, int r) {
		if (l == r) {
			if (data.contains(input) == false) {
				if (data.size() == 96) {
					return;
				}
				data.add(input);
			}
		} else {
			for (int i = l; i <= r; i++) {
				input = swap(input, l, i);
				permuteCharacets(input, l + 1, r);
				input = swap(input, l, i);
			}
		}
	}

	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	@Override
	public String toString() {
		return "ProgrammingExcercise [toString()=" + super.toString() + "]";
	}

}

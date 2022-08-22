package baekjoon.ref;

import java.util.TreeSet;

public class recursive {

	public static TreeSet<String> generateStrings(char[] chSet, int length) {
		TreeSet<String> set = new TreeSet<String>();
		if (length == 0)
		{
			set.add("");
			return set;
		}

		for (int i = 0; i < chSet.length; i++) {
			for (String arry : generateStrings(chSet, length - 1)) {
				set.add(String.valueOf(arry + chSet[i]));
			}
		}
		return set;
	}

	public static void main(String[] args) {
		char[] characters = { 'A', 'B', 'C', 'D', 'E' };
		int count = 0;
		for (String sequence : generateStrings(characters, 4)) {
			count++;
			System.out.printf("%5d. %s%n", count, sequence);
		}
	}
}

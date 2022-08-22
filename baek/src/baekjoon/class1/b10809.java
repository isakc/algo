package baekjoon.class1;

import java.util.Arrays;
import java.util.Scanner;
public class b10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		int[] alphabet = new int[26];
		StringBuilder sb = new StringBuilder();
		
		Arrays.fill(alphabet, -1);

		for(int i=0; i<text.length(); i++) {
			alphabet[text.charAt(i) - 'a'] = text.indexOf(text.charAt(i));
		}
		
		for(int num : alphabet) {
			sb.append(num + " ");
		}
		
		System.out.println(sb);
	}
}

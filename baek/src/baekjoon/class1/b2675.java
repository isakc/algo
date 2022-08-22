package baekjoon.class1;

import java.util.Scanner;

public class b2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		int time = 0;
		String text = new String();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len; i++) {
			time = sc.nextInt();
			text = sc.next();
			
			for(int j=0; j<text.length(); j++) {
				for(int k=0; k<time; k++) {
					sb.append(text.charAt(j));
				}
			}
			
			sb.append("\n");
		}

		sc.close();

		System.out.println(sb);
	}
}

package baekjoon.class1;

import java.util.Scanner;

public class b8958 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		String text;
		
		int sum = 0;
		int add = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<size; i++) {
			text = sc.next();
			sum = 0;
			add = 0;
			for(int j=0; j<text.length(); j++) {
				if(text.charAt(j) == 'O') {
					add++;
				}else {
					add = 0;
				}
				sum += add;
			}
			sb.append(sum +"\n");
		}
		System.out.println(sb);
	}
}

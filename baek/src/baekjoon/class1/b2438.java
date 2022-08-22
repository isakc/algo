package baekjoon.class1;

import java.util.Scanner;
public class b2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sc.close();
		for(int i=0; i<size; i++) {
			for(int j=0; j<i+1; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}

package baekjoon.class1;

import java.util.Scanner;

public class b2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sc.close();
		
		for(int i=1; i<=size; i++) {
			for(int j=1; j<=size ;j++) {
				if(j > size-i) {
					sb.append("*");
				}else {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}

package baekjoon.class1;

import java.util.Scanner;

public class b2742 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sc.close();
		
		while(num>0) {
			sb.append(num+"\n");
			num--;
		}
		System.out.println(sb);
	}
}

package baekjoon.class1;

import java.util.Scanner;

public class b2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		int sum = 0;
		
		for(int i=0; i<number.length; i++) {
			number[i] = sc.nextInt();
		}

		sc.close();
		
		for(int i=0; i<number.length; i++) {
			sum += Math.pow(number[i], 2);
		}
		
		System.out.println(sum % 10);
	}
}

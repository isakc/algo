package baekjoon.class1;

import java.util.Scanner;
public class b2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result = 1;
		int[] number = new int[10];
		for(int i=0; i<3; i++) {
			result *= sc.nextInt();
		}
		
		sc.close();
		
		String str = Integer.toString(result);
		
		for(int i=0; i<str.length(); i++) {
			number[str.charAt(i) - 48]++;
		}
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	}
}

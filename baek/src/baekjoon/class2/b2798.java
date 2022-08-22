package baekjoon.class2;

import java.util.Scanner;

public class b2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int number = sc.nextInt();
		int sum = 0;
		int temp = 0;
		int[] cards = new int[len];
		
		for(int i=0; i<len; i++) {
			cards[i] = sc.nextInt();
		}
		
		for(int i=0; i<len-2; i++) {
			for(int j=i+1; j<len-1; j++) {
				for(int k=j+1; k<len; k++) {
					temp = cards[i] + cards[j] + cards[k];
					if(temp > sum && temp <= number) {
						sum = temp;
					}
				}
			}
		}
		
		System.out.println(sum);
	}
}

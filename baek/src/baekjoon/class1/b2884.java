package baekjoon.class1;

import java.util.Scanner;

public class b2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if(min < 45) {
			hour--;
			if(hour < 0) {
				hour = 23;
			}
			min = 60 + (min - 45);
		}else {
			min = min - 45;
		}
		System.out.println(hour + " " + min);
	}
}

package baekjoon.class2;

import java.util.Scanner;

public class b4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a==0 && b==0 && c==0) {
				break;
			}
			
			if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
				System.out.println("right");
			}else if(Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
				System.out.println("right");
			}else if(Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
	}
}

package baekjoon.class2;

import java.util.Scanner;

public class b1085 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		int x_min = Math.min(x, w-x);	// x축 최소거리
		int y_min = Math.min(y, h-y);	// y축 최소거리
        
		// x와 y축 최소거리 중 가장 작은 값
		System.out.println(Math.min(x_min, y_min));
	}
}

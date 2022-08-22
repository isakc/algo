package baekjoon.class1;

import java.util.Scanner;
public class b2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] desc = {8, 7, 6, 5, 4, 3, 2, 1};
		int[] number = new int[8];
		
		for(int i=0; i<number.length; i++) {
			number[i] = sc.nextInt();
		}
		
		if(check(number, asc)) {
			System.out.println("ascending");
		}else if(check(number, desc)) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
	
	static boolean check(int[] number, int[] com) {
		for(int i=0; i<number.length; i++) {
			if(number[i] != com[i]) {
				return false;
			}
		}
		return true;
	}
}
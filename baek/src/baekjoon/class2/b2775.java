package baekjoon.class2;

import java.util.Scanner;
public class b2775 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] APT = new int[15][15];
		int T = sc.nextInt();
		int a = 0;
		int b = 0;
 
		for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;	// iÃþ 1È£
			APT[0][i] = i;	// 0Ãþ iÈ£
		}
 
 
		for(int i = 1; i < 15; i ++) {	// 1ÃþºÎÅÍ 14Ãþ±îÁö
			for(int j = 2; j < 15; j++) {	// 2È£ºÎÅÍ 14È£±îÁö
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
		
		for(int i = 0; i < T; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(APT[a][b]);
		}
	}
}
 

package baekjoon.class2;

import java.util.Scanner;

public class b7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int[] height = new int[len];
		int[] weight = new int[len];
		int[] rank = new int[len];
		
		for(int i=0; i<len; i++) {
			weight[i] = sc.nextInt();
			height[i] = sc.nextInt();
			rank[i] = 1;
		}
		
		
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				if(i==j) {
					continue;
				}
				
				if(weight[i] < weight[j] && height[i] < height[j]) {
					rank[i]++;
				}
			}
		}
		
		for(int i=0; i<len; i++) {
			System.out.print(rank[i] +" ");
		}
	}
}

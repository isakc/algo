package baekjoon.class3;

import java.util.Scanner;

public class b11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 동전의 종류
		int K = sc.nextInt(); // 금액
		int[] coins = new int[N];
		int count = 0;
		
		for(int i=0; i<N; i++) {
			coins[i] = sc.nextInt();
		}
		
		for(int i=N-1; i>=0; i--) {
			if(K>=coins[i]) {
				count+= K/coins[i];
				K = K%coins[i];
			}
		}
		
		System.out.println(count);
	}
}

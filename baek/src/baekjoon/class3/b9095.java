package baekjoon.class3;

import java.util.Scanner;

public class b9095 {
	static int dp[] = new int [11];//dp °ª
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		dp[1] = 1; 
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i=4; i<=10; i++) {
			dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
		}
		
		while(T-->0) {
			int n = sc.nextInt();
			System.out.println(dp[n]);
		}
	}
}
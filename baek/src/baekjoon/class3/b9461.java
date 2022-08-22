package baekjoon.class3;

import java.util.Scanner;

public class b9461 {
	public static long[] dp = new long[101];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		dp[0] = 0l;
		dp[1] = 1l;
		dp[2] = 1l;
		dp[3] = 1l;
		
		int T = sc.nextInt();
		
		while(T-- > 0) {
			int N = sc.nextInt();
			System.out.println(recur(N));
		}
		
	}
	
	public static long recur(int N) {
		if(dp[N] == 0) {	
			dp[N] = recur(N - 2) + recur(N - 3);
		}
		return dp[N];
	}
}

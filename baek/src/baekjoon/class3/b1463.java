package baekjoon.class3;

import java.util.Scanner;

public class b1463 {
 
	static Integer[] dp;
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
 
		dp = new Integer[N + 1];
		dp[0] = dp[1] = 0;
 
		System.out.print(recur(N));
 
	}
 
	static int recur(int N) {
 
		if (dp[N] == null) {
			// 6���� �������� ��� 
			if (N % 6 == 0) {
				dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
			}
			// 3���θ� �������� ��� 
			else if (N % 3 == 0) {
				dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
			}
			// 2�θ� �������� ��� 
			else if (N % 2 == 0) {
				dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
			}
			// 2�� 3���� ���������� �ʴ� ���
			else {
				dp[N] = recur(N - 1) + 1;
			}
		}
		return dp[N];
	}
 
}
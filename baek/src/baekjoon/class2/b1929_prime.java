package baekjoon.class2;

import java.util.Scanner;

public class b1929_prime {
	public static boolean[] prime;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		
		prime = new boolean[N + 1];
		get_prime();
				
		StringBuilder sb = new StringBuilder();
		for(int i = M; i <= N; i++) {
			// false = 소수 
			if(!prime[i]) sb.append(i).append('\n');
		}
		System.out.println(sb);	
	}
	
	public static void get_prime() {
		// true = 소수아님 , false = 소수 
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}

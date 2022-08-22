package baekjoon.class3;

import java.util.Arrays;
import java.util.Scanner;

public class b11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int t = 0;
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		
		for(int i=0; i<N; i++) {
			t += arr[i] * (N-i);
		}
		
		System.out.println(t);
	}
}

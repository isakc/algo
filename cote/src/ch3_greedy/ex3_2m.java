package ch3_greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ex3_2m {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int K = sc.nextInt(); // 총 더하는 횟수 
		int M = sc.nextInt(); // 연속으로 가능한 횟수
		int count = 0; // 몇번 더했는지 카운트
		int sum=0; // 총합
		int[] number = new int[len];
		
		for(int i=0; i<len; i++) {
			number[i] = sc.nextInt();
		}
		
		Arrays.sort(number);
		
		for(int i=0; i<K; i++) {
			if(count == M) {
				sum+=number[len-2];
				count=0;
			}else {
				sum+=number[len-1];
				count++;
			}
		}
		
		System.out.println(sum);
	}
}

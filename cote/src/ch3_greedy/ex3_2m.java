package ch3_greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ex3_2m {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int K = sc.nextInt(); // �� ���ϴ� Ƚ�� 
		int M = sc.nextInt(); // �������� ������ Ƚ��
		int count = 0; // ��� ���ߴ��� ī��Ʈ
		int sum=0; // ����
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

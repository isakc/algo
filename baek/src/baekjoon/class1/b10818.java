package baekjoon.class1;

import java.util.Scanner;

public class b10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<size; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i=1; i<size; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println(min + " " +max);
	}
}

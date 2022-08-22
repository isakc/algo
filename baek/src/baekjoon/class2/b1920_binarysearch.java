package baekjoon.class2;

import java.util.Scanner;
import java.util.Arrays;
 
public class b1920_binarysearch {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
 
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // 이분 탐색 하기전에 정렬이 되어있어야 한다.
		
		int len = sc.nextInt();
		int key = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < len; i++) {
			key = sc.nextInt();
			if(binarySearch(arr, key) >= 0) {
				sb.append(1).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int binarySearch(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length - 1;	
 
		while(lo <= hi) {
			int mid = (lo + hi) / 2;
			if(key < arr[mid]) {
				hi = mid - 1;
			}
			else if(key > arr[mid]) {
				lo = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}

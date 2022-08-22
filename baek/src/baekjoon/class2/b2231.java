package baekjoon.class2;

import java.util.Scanner;

public class b2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int min = 0;
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum=0;
			for(int j=0; j<Integer.toString(i).length(); j++) {
				 sum += (Integer.toString(i).charAt(j)-'0');
			}
			sum+=i;
			if(sum == n) {
				min =i;
				break;
			}
		}
		
		System.out.println(min);
	}
}

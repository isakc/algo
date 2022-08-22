package prac;

import java.util.Scanner;

public class c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		int need = sc.nextInt();
		int[] cables = new int[len];
		
		long max = 0;
		
		for(int i=0; i<len; i++) {
			cables[i] = sc.nextInt();
			if(max < cables[i]) {
				max = cables[i];
			}
		}
		
		max++;
		
		long min = 0;
		long mid = 0;
		
		while(min < max) {
			mid = (min + max) / 2;
			long count = 0;
			
			for(int i=0; i<len; i++) {
				count += cables[i] / mid;
			}
			
			if(count < need) {
				max = mid;
			}else {
				min = mid+1;
			}
		}
		
		System.out.println(min-1);
	}
}
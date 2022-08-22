package baekjoon.class1;

import java.util.Scanner;
public class b2562 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] num = new int[9];
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		sc.close();
		
		int maxValue = num[0];
		int index = 0;
		
		for(int i=1; i<num.length; i++) {
			if(num[i] > maxValue) {
				maxValue = num[i];
				index = i;
			}
		}
		
		System.out.println(maxValue);
		System.out.println(index+1);
	}
}

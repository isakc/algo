package prac;

import java.util.Scanner;
import java.util.Stack;

public class b1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] num = new int[N];
		StringBuilder sb = new StringBuilder();
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i=1; i<N+1; i++) {
			st.push(i);
			
			if(num[i-1] == i) {
				
			}
		}
		
	}
}

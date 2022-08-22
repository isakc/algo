package baekjoon.class2;

import java.util.Scanner;
import java.util.Stack;

public class b10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int number = 0;
		Stack<Integer> stack = new Stack();

		for(int i=0; i<T; i++) {
			number = sc.nextInt();
			if(number != 0) {
				stack.push(number);
			}else {
				stack.pop();
			}
		}
		
		int sum=0;
		int len = stack.size();
		
		for(int i=0; i<len; i++) {
			sum+= stack.peek();
			stack.pop();
		}
		System.out.println(sum);
	}
}

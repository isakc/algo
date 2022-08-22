package baekjoon.class2;

import java.util.LinkedList;
import java.util.Scanner;

public class b2164 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int i=n; i>0; i--) {
			list.add(i);
		}
		
		while(list.size()!=1) {
			list.removeLast();
			list.addFirst(list.getLast());
			list.removeLast();
		}
		
		System.out.println(list.get(0));
	}
}

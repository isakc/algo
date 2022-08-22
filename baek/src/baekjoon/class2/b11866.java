package baekjoon.class2;

import java.util.LinkedList;
import java.util.Scanner;

public class b11866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		int pointer = K-1;
		LinkedList<Integer> list = new LinkedList();
		
		for(int i=1; i<=N; i++) {
			list.add(i);
		}
		
		sb.append("<");
		
		while(list.size() !=0) {
			
			while(true) {
				if(pointer > list.size()) {
					pointer -= list.size();
				}else if(pointer == list.size()) {
					pointer=0;
				}else {
					break;
				}
			}
			
			if(list.size()!=1) {
				sb.append(list.get(pointer) + ", ");
				list.remove(pointer);
			}else {
				sb.append(list.get(pointer) + ">");
				list.remove(pointer);
			}

			pointer += K-1;
		}
		
		System.out.println(sb);
	}
}

package baekjoon.class3;

import java.util.HashMap;
import java.util.Scanner;

public class b17219 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int n = sc.nextInt();
		HashMap<String, String> map = new HashMap();
		StringBuilder sb = new StringBuilder();
		sc.nextLine();
		
		for(int i=0; i<len; i++) {
			map.put(sc.next(), sc.next());
		}
		
		sc.nextLine();
		for(int i=0; i<n; i++) {
			String site = sc.nextLine();
			sb.append(map.get(site)).append("\n");
		}
		
		System.out.println(sb);
	}
}

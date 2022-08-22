package baekjoon.class2;

import java.util.Scanner;

public class b1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		StringBuilder pal = new StringBuilder();
		String num = new String();
		int n = -1;
		
		while(true) {
			n = sc.nextInt();
			if(n == 0) {
				break;
			}else {
				num = Integer.toString(n);
				pal.setLength(0); 
				for(int i=num.length()-1; i>=0; i--) {
					pal.append(num.charAt(i));
				}
				
				if(pal.toString().equals(num)) {
					sb.append("yes");
				}else {
					sb.append("no");
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}

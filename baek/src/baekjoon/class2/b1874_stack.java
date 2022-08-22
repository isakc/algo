package baekjoon.class2;

import java.util.Scanner;
import java.util.Stack;
 
public class b1874_stack {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();	// ����� ����� ����
		
		Stack<Integer> stack = new Stack<>();
		
		int N = in.nextInt();
		
		int start = 0; // last
		
		// N �� �ݺ�
		while(N -- > 0) {
			
			int value = in.nextInt();
			
			if(value > start) {
				// start + 1���� �Է¹��� value ���� push�� �Ѵ�.
				for(int i = start + 1; i <= value; i++) {
					stack.push(i);
					sb.append('+').append('\n');	// + �� �����Ѵ�. 
				}
				start = value; 	// ���� push �� ���� ���������� �����ϱ� ���� ���� �ʱ�ȭ 
			}
			
			// top�� �ִ� ���Ұ� �Է¹��� ���� ���� ���� ���  
			else if(stack.peek() != value) {
				System.out.println("NO");
				return;		// �Ǵ� System.exit(0); ���� ��ü�ص� ��. 
			}
			
			stack.pop();
			sb.append('-').append('\n');
			
		}
		
		System.out.println(sb);
	}
}

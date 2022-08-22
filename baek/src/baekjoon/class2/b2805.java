package baekjoon.class2;

import java.util.Scanner;

public class b2805 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int[] tree = new int[N];
		
		int min = 0;
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			tree[i] = in.nextInt();
			if(max < tree[i]) {
				max = tree[i];
			}
		}
		
		while(min < max) {
			
			int mid = (min + max) / 2;
			long sum = 0;
			for(int treeHeight : tree) {
				
				/*
				 *  tree�� �߸� ���� = tree�� ���� - �ڸ��� ��ġ(mid)
				 *  tree�� �߸� ������ ���� ���Ѵ�.
				 *  �� �� �ڸ��� ��ġ�� �־��� ������ ���̺��� Ŭ �� �ֱ� ������
				 *  0 ������ ���(=����)���� �ջ��� ���� �ʰ� ����� �ջ��ϵ��� �ؾ��Ѵ�.
				 */
				if(treeHeight - mid > 0) { 
					sum += (treeHeight - mid);
				}
			}
			
 
			/*
			 * �ڸ� ���� ������ ���� M���� �۴ٴ� ����
			 * �ڸ��� ��ġ(����)�� ���ٴ� �ǹ��̹Ƿ� ���̸� ����� �Ѵ�.
			 * ��, ����(max)�� �ٿ��� �Ѵ�.
			 */
			if(sum < M) {
				max = mid;
			}
			
			/*
			 * �ڸ� ���� ������ ���� M���� ũ�ٴ� ����
			 * �ڸ��� ��ġ(����)�� ���ٴ� �ǹ��̹Ƿ� ���̸� ������ �Ѵ�.
			 * ����, ���� ��쿡�� �ִ��� ���� �ڸ��� ���� �ڸ��� ���̸�
			 * ������ �ϹǷ� ����(min)�� �÷��� �Ѵ�.
			 */
			else {
				min = mid + 1;
			}
		}
		
		System.out.println(min - 1);
		
	}
}
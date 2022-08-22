package baekjoon.class2;

import java.util.Scanner;

public class b1018 {
 
	public static boolean[][] arr;
	public static int min = 64;
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int M = in.nextInt();
 
		arr = new boolean[N][M];
		
		/*
		 * Scanner �� ��� �����ڷ� �����ϴٰ�
		 * �������� �ԷµǸ� ��Ʈ���� ������ �����־
		 * �ǵ��� �޸� ù ��° String �Է��� ������ ����ȴ�.
		 * �׷��� ������ nextLine() �� ���� 
		 * ���ڿ� �Է� ���� int�� String �Է� ������ ������ �����ֵ��� �Ѵ�.
		 */
		in.nextLine();
        
		// �迭 �Է� 
		for (int i = 0; i < N; i++) {
			String str = in.nextLine().trim();
			
			for (int j = 0; j < M; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;		// W�� ���� true 
				} else {
					arr[i][j] = false;		// B�� ���� false
				}
 
			}
		}
 
		
		int N_row = N - 7;
		int M_col = M - 7;
 
		for (int i = 0; i < N_row; i++) {
			for (int j = 0; j < M_col; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
	}
 
	
	public static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
 
		boolean TF = arr[x][y];	// ù ��° ĭ�� �� 
 
		for (int i = x; i < end_x; i++) {
			for (int j = y; j < end_y; j++) {
 
				// �ùٸ� ���� �ƴҰ�� count 1 ���� 
				if (arr[i][j] != TF) {	
					count++;
				}
				
				/* 
				 * ���� ĭ�� ���� �ٲ�Ƿ�
				 * true��� false��, false ��� true ��
				 * ���� �����Ѵ�.
				 */
				TF = (!TF);
			}
			
			TF = !TF;
		}
		
		/*
		 *  ù ��° ĭ�� �������� �� ���� ��ĥ �� ����(count)��
		 *  ù ��° ĭ�� ���� �ݴ�Ǵ� ���� �������� �� ����
		 *  ��ĥ �� ����(64 - count) �� �ּڰ��� count �� ���� 
		 */
		count = Math.min(count, 64 - count);
		
		/*
		 * ���������� ��� �� �ּڰ����� ���� count ����
		 * �� ���� ��� �ּڰ��� ���� 
		 */
		min = Math.min(min, count);
	}
}
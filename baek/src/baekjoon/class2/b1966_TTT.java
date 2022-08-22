package baekjoon.class2;

import java.util.Scanner;
import java.util.LinkedList;
 
public class b1966_TTT {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = in.nextInt();	// �׽�Ʈ ���̽�
		int N = 0; //������ ����
		int M = 0; // �� ��°�� �μ�Ǿ����� �ñ��� ������ �ε���
		LinkedList<int[]> Queue; // Queue�� Ȱ�� �� ���Ḯ��Ʈ
 
		while (T-- > 0) {
			N = in.nextInt();
			M = in.nextInt();
			Queue = new LinkedList<>();
 
			for (int i = 0; i < N; i++) {
				Queue.offer(new int[] { i, in.nextInt() }); // {�ʱ� ��ġ, �߿䵵}
			}
 
			int count = 0;
			
			while (!Queue.isEmpty()) {	// �� ���̽��� ���� �ݺ���
				
				int[] front = Queue.poll();	// ���� ù ����
				boolean isMax = true;	// front ���Ұ� ���� ū ���������� �Ǵ��ϴ� ����
				
				// ť�� �����ִ� ���ҵ�� �߿䵵�� �� 
				for(int i = 0; i < Queue.size(); i++) {
					// ó�� ���� ���Һ��� ť�� �ִ� i��° ���Ұ� �߿䵵�� Ŭ ��� 
					if(front[1] < Queue.get(i)[1]) {
						// ���� ���� �� i ������ ���ҵ��� �ڷ� ������.
						Queue.offer(front);
						for(int j = 0; j < i; j++) {
							Queue.offer(Queue.poll());
						}
						// front���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� false�� �ϰ� Ž���� ��ħ
						isMax = false;
						break;
					}
				}
				// front ���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� ���� �ݺ������� �Ѿ
				if(isMax == false) {
					continue;
				}
				// front ���Ұ� ���� ū ���ҿ����Ƿ� �ش� ���Ҵ� ����ؾ��ϴ� ������.
				count++;
				if(front[0] == M) {	// ã���� �ϴ� ������� �ش� �׽�Ʈ���̽� ����
					break;
				}
			}
			sb.append(count).append('\n');
		}
		System.out.println(sb);
	}
}

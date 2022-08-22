package greedy;

import java.util.Scanner;
public class Level2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		Solution2 s = new Solution2();
		System.out.println(s.solution(name));
	}
}

class Solution2 {
	public int solution(String name) {
		  int answer = 0;
		  int len = name.length();

		  // ���� ª�� ��, �� �̵��� �׳� �� ���������� �̵��� ��
		  int min = len - 1;

		  for (int i = 0; i < len; i++) {
		    // ���̽�ƽ ��, �� �̵�
		    char c = name.charAt(i);
		    int mov = (c - 'A' < 'Z' - c + 1) ? (c - 'A') : ('Z' - c + 1);
		    answer += mov;

		    // ���̽�ƽ ��, �� �̵�
		    int nextIndex = i + 1;
		    // ���� �ܾ A�̰�, �ܾ ������ ������ nextIndex ����
		    while (nextIndex < len && name.charAt(nextIndex) == 'A')
		      nextIndex++;

		    min = Math.min(min, (i * 2) + len - nextIndex);
		  }

		  answer += min;

		  return answer;
	}
}

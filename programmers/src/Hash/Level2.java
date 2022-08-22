package Hash;

import java.util.HashMap;

public class Level2 {
	public static void main(String[] args) {
		String[] phone_book = { "1195524421", "97674223", "119" };
		Solution2 s = new Solution2();
		System.out.println(s.solution(phone_book));
	}
}

class Solution2 {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		// 1. HashMap �����
		HashMap<String, Integer> map = new HashMap<>();

		// 2. ��� ��ȭ��ȣ Hashing �ϱ� (Hash Map�� �߰��ϱ�)
		for (int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i], i);
		}

		// 3. �ٽ� ���� �� ��ȭ��ȣ�� �Ϻΰ� HashMap�� �ִ��� Ȯ���ϱ� (���ξ �����ϴ��� Ȯ���ϱ�)
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 1; j < phone_book[i].length(); j++) {
				if (map.containsKey(phone_book[i].substring(0, j))) {
					answer = false;
					return answer;
				}
			}
		}
		return answer;

	}
}
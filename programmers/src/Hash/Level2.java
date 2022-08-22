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
		// 1. HashMap 만들기
		HashMap<String, Integer> map = new HashMap<>();

		// 2. 모든 전화번호 Hashing 하기 (Hash Map에 추가하기)
		for (int i = 0; i < phone_book.length; i++) {
			map.put(phone_book[i], i);
		}

		// 3. 다시 돌며 각 전화번호의 일부가 HashMap에 있는지 확인하기 (접두어가 존재하는지 확인하기)
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
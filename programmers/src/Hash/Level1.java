package Hash;

import java.util.Arrays;

public class Level1 {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		Solution s = new Solution();
		
		System.out.println(s.solution(participant, completion));
	}
}

class Solution{
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				answer += participant[i];
				return answer;
			}
		}
		answer += participant[participant.length - 1];
		return answer;
    }
}
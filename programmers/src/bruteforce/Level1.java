package bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level1 {
	public static void main(String[] args) {
		int[] answers = {1,5,4,2,3,5,3,2,1,4,4,4,3,2,1,5,2,5,1,2,4,3,2,1};
		Solution s = new Solution();
		
		int[] answer = s.solution(answers);
		
		for(int i=0; i<answer.length; i++) {
			if(i==(answer.length-1)) {
				System.out.print(i + 1);
			}else {
				System.out.print(i+1 + ", ");
			}
		}
	}
}

class Solution {
    public int[] solution(int[] answers) {
    	int[] point = {0,0,0}; // ����ǥ
        int[] pointCopy = {}; // ����ǥ ����
        int max = 0; // ���� �ִ밪
        List<Integer> list = new ArrayList<Integer>(); // ������ �ֱ�

        int[][] spzPatterns = {
                                {1, 2, 3, 4, 5},        // �����ڵ���  ����
                                {2, 1, 2, 3, 2, 4, 2, 5},
                                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // [1] ä���ϱ�
        for (int i = 0; i < answers.length; i++) {
            if (spzPatterns[0][i%5] == answers[i]) {
                point[0]++;
            }

            if (spzPatterns[1][i%8] == answers[i]) {
                point[1]++;
            }

            if (spzPatterns[2][i%10] == answers[i]) {
                point[2]++;
            }
        }

        // [2] ����ǥ �����ؼ� ���� ū �� ã��
        pointCopy = point.clone();
        Arrays.sort(pointCopy);
        max = pointCopy[2];

        for (int i = 0; i < point.length; i++) {
            if (point[i] == max) {
                list.add(i+1);
            }
        }

        // [3] ���� ū ���� ���� �л� ��ȣ ���ϱ�
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
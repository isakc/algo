package greedy;

import java.util.Arrays;

public class Level1 {
	public static void main(String[] args) {
		int[] lost = {3};
		int[] reserve = {1};
		Solution s = new Solution();
		
		System.out.println(s.solution(3, lost, reserve));
	}
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
     // ���� ü������ ������ �л��� �������� ���
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1; 
                    break; 
                }
            }
        }
        // �������� �л����� ü���� �����ִ� ���
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1; 
                    break; 
                }
            }
        }
        return answer;
    }
}

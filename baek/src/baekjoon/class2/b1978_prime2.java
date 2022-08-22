package baekjoon.class2;

import java.util.Scanner;

public class b1978_prime2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int count = 0;
		
		while(T-- > 0) {
			if(is_Prime(sc.nextInt())) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	static boolean is_Prime(int Number) {
		 
		// 1 �� �Ҽ��� �ƴϴ�.
		if(Number == 1){
			return false;	
		}
	    
		// 2 ~ Number-1 ���� �� ������ �������� ����� �ִ��� �Ǻ�
		// Number = 2 �� ���� �ڿ������� for���� �˻����� �ʰ� ��
	    
		for(int i = 2; i <= Math.sqrt(Number); i++) {
			if(Number % i == 0) return false;
		}
	    
		// �� �� ���ǿ� �ɸ��� ������ �Ҽ���.
		return true;
	}
}

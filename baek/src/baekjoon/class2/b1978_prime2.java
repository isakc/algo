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
		 
		// 1 은 소수가 아니다.
		if(Number == 1){
			return false;	
		}
	    
		// 2 ~ Number-1 까지 중 나누어 떨어지는 약수가 있는지 판별
		// Number = 2 의 경우는 자연스럽게 for문을 검사하지 않게 됨
	    
		for(int i = 2; i <= Math.sqrt(Number); i++) {
			if(Number % i == 0) return false;
		}
	    
		// 위 두 조건에 걸리지 않으면 소수다.
		return true;
	}
}

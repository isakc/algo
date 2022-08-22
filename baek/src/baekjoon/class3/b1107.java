package baekjoon.class3;

import java.util.*;

public class b1107 {    
    
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        
        int ch = scan.nextInt();
        int size = scan.nextInt();
        
        boolean[] bt = new boolean[10];
        for(int i = 0; i < size; i++) {
            int n = scan.nextInt();
            bt[n] = true;
        }
        
        int result = Math.abs(ch - 100); //초기값 설정
        for(int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();
            
            boolean isBreak = false;
            for(int j = 0; j < len; j++) {
                if(bt[str.charAt(j) - '0']) { //고장난 버튼을 눌러야 하면
                    isBreak = true; 
                    break; //더 이상 탐색하지 않고 빠져나온다.
                }
            }
            if(!isBreak) { //i를 누를때 고장난 버튼을 누르지 않는다면
                int min = Math.abs(ch - i) + len; //i를 누른 후(len) target까지 이동하는 횟수(target - i)
                result = Math.min(min, result);
            }
        }        
        System.out.println(result);
    }
}


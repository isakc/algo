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
        
        int result = Math.abs(ch - 100); //�ʱⰪ ����
        for(int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();
            
            boolean isBreak = false;
            for(int j = 0; j < len; j++) {
                if(bt[str.charAt(j) - '0']) { //���峭 ��ư�� ������ �ϸ�
                    isBreak = true; 
                    break; //�� �̻� Ž������ �ʰ� �������´�.
                }
            }
            if(!isBreak) { //i�� ������ ���峭 ��ư�� ������ �ʴ´ٸ�
                int min = Math.abs(ch - i) + len; //i�� ���� ��(len) target���� �̵��ϴ� Ƚ��(target - i)
                result = Math.min(min, result);
            }
        }        
        System.out.println(result);
    }
}


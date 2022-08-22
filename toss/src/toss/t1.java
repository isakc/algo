package toss;

import java.util.Scanner;

public class t1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char[] arr = s.toCharArray();
        char check = arr[0];
        int count = 1;
        int answer = -1;

        for(int i=1; i<arr.length; i++){
            if(check != arr[i]){
                if(count == 3){
                	int num = Character.getNumericValue(check);
                    int tmp = num * 100 + num*10 + num;
                    if(tmp>answer){
                        answer=tmp;
                    }
                    count=1;
                    check = arr[i];
                }else{
                    check = arr[i];
                    count=1;
                }

            }
            else{
                count++;
            }
        }
        
        if(count == 3){
        	int num = Character.getNumericValue(check);
            int tmp = num * 100 + num*10 + num;
            if(tmp>answer){
                answer=tmp;
            }
        }
        
        System.out.println(answer);
		
	}
}

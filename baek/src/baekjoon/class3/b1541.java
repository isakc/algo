package baekjoon.class3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array = br.readLine().split("-");
		String[] plus;
		int result = 0;
		
		for(int i=0; i<array.length; i++) {
			int sum=0;
			if(array[i].contains("+")) {
				plus = array[i].split("\\+");
				
				for(String s: plus) {
					sum+= Integer.parseInt(s);
				}
				
				array[i] = Integer.toString(sum);
			}
			if(i!=0) {
				result-= Integer.parseInt(array[i]);
			}else {
				result = Integer.parseInt(array[i]);
			}
			
		}
		
        System.out.println(result);
	}
}

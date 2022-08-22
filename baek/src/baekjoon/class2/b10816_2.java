package baekjoon.class2;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class b10816_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
		int size = sc.nextInt();
		
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<size; i++) {
			map.put(sc.nextInt(), 0);
		}
		
		for(int i=0; i<len; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1); 
			}
		}
		
		for (Integer mapkey : map.keySet()){
	        System.out.print(map.get(mapkey) + " ");
	    }
	}
}

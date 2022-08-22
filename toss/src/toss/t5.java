package toss;

import java.util.*;

public class t5 {
	public static void main(String[] args) {
		int[] tasks = {1,1,2,3,3,2,2};
		
		int count=0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<tasks.length; i++) {
			if(map.containsKey(tasks[i])) {
				map.put(tasks[i], map.get(tasks[i])+1);
			}else {
				map.put(tasks[i], 1);
			}
		}
		
		Iterator<Integer> keys = map.keySet().iterator();
		
		while(keys.hasNext()){
			int key = keys.next();
			if(map.get(key) == 1) {
				count = -1;
				break;
			}else {
				if(map.get(key) % 3 == 0) {
					count+=map.get(key)/3;
				}else {
					count+=map.get(key)/3+1;
				}
			}
		}
		
		System.out.println(count);
	}
}

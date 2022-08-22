package prac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class compare2 {
	public static void main(String[] args) {

		int[][] test3 = {{2,3}, {3,4,5}, {6,3,6,6,6,6}, {8,3,4,2,3}, {63, 62}, {13,80}};
		
		Arrays.sort(test3, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return o2[1]-o1[1];
			}
		});

//		for(int i=0; i<test3.length; i++) {
//			for(int j=0; j<2; j++) {
//				System.out.print(test3[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}

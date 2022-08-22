package prac;

import java.util.StringTokenizer;

public class b_12891 {
	public static void main(String[] args) {
		String s = "aaa12333";
		String s2 = "aaa1423";
		String answer ="=";

		int[] nums1 = toArr(s);
		int[] nums2 = toArr(s2);
		
		for(int i=0; i<nums1.length; i++) {
			if(nums1[i] > nums2[i]) {
				answer = ">";
				break;
			}else if(nums1[i] < nums2[i]) {
				answer = "<";
				break;
			}
		}
		
		System.out.println(answer);
	}
	
	public static int[] toArr(String str) {
		String numStr = str.replaceAll("[^0-9]", " ");
		StringTokenizer st = new StringTokenizer(numStr);
		int[] nums = new int[st.countTokens()];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		return nums;
	}
}

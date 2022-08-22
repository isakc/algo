package prac;

import java.util.*;

public class compare {
	public static void main(String[] args) {
		String[] test = { "aqwed", "cetrw", "abcd", "bcede", "ahfere" };
		Integer[] test2= { 25, 35, 73,33, 63, 757, 3245, 235, 9956, 41, 353, 223};
		
		Arrays.sort(test, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		for(String a : test) {
			System.out.println(a);
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Arrays.sort(test2, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
//		for(Integer aa : test2) {
//			System.out.println(aa);
//		}
		
		
		
		Apple[] aa = new Apple[] {
				new Apple(24, 2000, "마-734645454", "썽의 아이패드"),
				new Apple(38, 2012, "누-745754644", "문의 아이맥"),
				new Apple(47, 2022, "무-4374373567", "내꺼"),
				new Apple(32, 2022, "야-1234527374", "나의 에어팟2"),
				new Apple(32, 2022, "가-1234527374", "나의 에어팟"),
				new Apple(24, 2022, "하-3573812995", "몰라")
		};
		
		Arrays.sort(aa, new Comparator<Apple>() {
			
			@Override
			public int compare(Apple o1, Apple o2) {
				if(o1.year == o2.year) {
					if(o1.weight == o2.weight) {
						return o1.number.compareTo(o2.number);
					}else {
						return o1.weight-o2.weight;
					}
				}else if(o1.year < o2.year) {
					return o1.weight-o2.weight;
				}else {
					return 1;
				}
			}
		});
		
		for(Apple a : aa) {
			System.out.println(a);
		}
	}
	
	static class Apple{
		int weight;
		int year;
		String number;
		String name;
		
		public Apple(int weight, int year, String number, String name) {
			this.weight = weight;
			this.year = year;
			this.number = number;
			this.name = name;
		}
		
		public String toString() {
			return "이름: " + name + "/ 년도: " + year + "/ 넘버: " + number + "/ 무게: " + weight;
		}
	}
}

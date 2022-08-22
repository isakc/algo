package baekjoon.class1;

import java.util.Scanner;

public class b1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		int[] scores = new int[len];
		double sum = 0;
		
		for (int i = 0; i < len; i++) {
			scores[i] = sc.nextInt();
		}

		double[] newScores = new double[len];
		int maxValue = scores[0];

		for (int i = 1; i < len; i++) {
			if (scores[i] > maxValue) {
				maxValue = scores[i];
			}
		}

		for (int i = 0; i < len; i++) {
			newScores[i] = scores[i] / (double)maxValue * 100;
		}

		for (int i = 0; i < len; i++) {
			sum += newScores[i];
		}
		System.out.println(sum / len);
	}
}

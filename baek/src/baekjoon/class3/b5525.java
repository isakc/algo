package baekjoon.class3;

import java.util.Scanner;

public class b5525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int size = sc.nextInt();

        char[] arr = sc.next().toCharArray();
        int[] check = new int[size];
        int count = 0;

        for (int i=1; i<size-1; i++) {
            if (arr[i] == 'O' && arr[i+1] == 'I') {
                check[i+1] = check[i-1]+1;

                if (check[i+1] >= N && arr[i-2 * N+1] == 'I')
                    count++;
            }
        }
        System.out.println(count);
    }
}
package ch8_dp;

import java.util.*;

public class ex8_3 {

    public static long[] d = new long[100];

    public static void main(String[] args) {
        // ù ��° �Ǻ���ġ ���� �� ��° �Ǻ���ġ ���� 1
        d[1] = 1;
        d[2] = 1;
        int n = 50; // 50��° �Ǻ���ġ ���� ���

        // �Ǻ���ġ �Լ�(Fibonacci Function) �ݺ������� ����(���Ҿ� ���̳��� ���α׷���)
        for (int i = 3; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        System.out.println(d[n]);
    }
}
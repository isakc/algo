package ch6_sorting;

import java.util.*;

public class ex6_3 {

    public static void main(String[] args) {

        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 1; i < n; i++) {
            // �ε��� i���� 1���� �����ϸ� �ݺ��ϴ� ����
            for (int j = i; j > 0; j--) {
                // �� ĭ�� �������� �̵�
                if (arr[j] < arr[j - 1]) {
                    // ������(Swap)
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                // �ڱ⺸�� ���� �����͸� ������ �� ��ġ���� ����
                else break;
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
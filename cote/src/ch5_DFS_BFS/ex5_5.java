package ch5_DFS_BFS;

import java.util.*;

public class ex5_5 {

    // �ݺ������� ������ n!
    public static int factorialIterative(int n) {
        int result = 1;
        // 1���� n������ ���� ���ʴ�� ���ϱ�
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // ��������� ������ n!
    public static int factorialRecursive(int n) {
        // n�� 1 ������ ��� 1�� ��ȯ
        if (n <= 1) return 1;
        // n! = n * (n - 1)!�� �״�� �ڵ�� �ۼ��ϱ�
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        // ������ ������� ������ n! ���(n = 5)
        System.out.println("�ݺ������� ����:" + factorialIterative(5));
        System.out.println("��������� ����:" + factorialRecursive(5));
    }

}
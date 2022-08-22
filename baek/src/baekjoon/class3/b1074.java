package baekjoon.class3;

import java.util.*;
import java.io.*;

class bt1074_TTT {

    static int N;
    static int r;
    static int c;
    static int count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int n = getSize(N);
        int count = 0;
        int x = 0;
        int y = 0;

        /**
         * �簢�� �������� ������ �� ��и����� ���
         * n �� 1 �� �ȴٴ� ���� x, y ��ǥ�� r, c�� �������ٴ� ��
         */
        while (n > 0) {
            n /= 2;

            // 2��и� (�� ��)
            if (r < x+n && c < y+n) {
                count += n * n * 0;
            }
            // 1��и� (���� ��)
            else if (r < x+n) {
                count += n * n * 1;
                y += n;
            }
            // 3��и� (�� �Ʒ�)
            else if (c < y+n) {
                count += n * n * 2;
                x += n;
            }
            // 4��и� (���� �Ʒ�)
            else {
                count += n * n * 3;
                x += n;
                y += n;
            }

            if(n == 1) {
                System.out.println(count);
                break;
            }
        }
    }

    static int getSize(int n) {
        int result = 1;
        for(int i=0; i<n; i++) {
            result *= 2;
        }
        return result;
    }
}
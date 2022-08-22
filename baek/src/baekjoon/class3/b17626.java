package baekjoon.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class b17626 {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
 
        int[] dp = new int[N + 1];
        dp[1] = 1;
 
        int min = 0;
        for (int i = 2; i <= N; i++) {
            min = Integer.MAX_VALUE;
            
            // i���� i���� ���� ���������� �� dp[i - j * j] ��
            // �ּҸ� ���Ѵ�.
            for (int j = 1; j * j <= i; j++) {
                int temp = i - j * j;
                min = Math.min(min, dp[temp]);
            }
 
            dp[i] = min + 1; // �׸��� 1�� �����ش�.
        }
 
        bw.write(dp[N] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
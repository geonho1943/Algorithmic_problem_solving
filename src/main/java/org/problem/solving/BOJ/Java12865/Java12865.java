package org.problem.solving.BOJ.Java12865;

import java.util.Scanner;

public class Java12865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 물건의 개수
        int K = sc.nextInt(); // 배낭의 최대 무게

        int[] weights = new int[N + 1]; // 물건의 무게
        int[] values = new int[N + 1];  // 물건의 가치

        for (int i = 1; i <= N; i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }

        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            for (int w = 0; w <= K; w++) {
                if (weights[i] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i]] + values[i]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}

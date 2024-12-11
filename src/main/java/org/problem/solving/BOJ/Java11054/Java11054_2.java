package org.problem.solving.BOJ.Java11054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java11054_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxLength = 0;
        int[] dp;

        // 고점 i 설정
        for (int i = 0; i < N; i++) {
            dp = new int[N]; // DP 배열 초기화
            dp[0] = 1;

            for (int j = 0; j < N; j++) {

                if (j < i && arr[j] < arr[i]) { // j가 i보다 작고,
                    for (int k = 0; k < j; k++) {
                        if (arr[k] < arr[j]) { // 증가 조건 만족
                            dp[j] = Math.max(dp[j], dp[k] + 1);
                        }
                    }
                } else if (j > i && arr[j] < arr[i]) { // j가 i보다 크고,
                    for (int k = 0; k < j; k++) {
                        if (arr[k] > arr[j]) { // 감소 조건 만족
                            dp[j] = Math.max(dp[j], dp[k] + 1);
                        }
                    }
                }
            }

            // 고점 i 일때 최댓값 갱신
            for (int j = 0; j < N; j++) {
                maxLength = Math.max(maxLength, dp[j]);
            }
        }
        System.out.println(maxLength + 1); // 고점 추가, 출력
    }
}
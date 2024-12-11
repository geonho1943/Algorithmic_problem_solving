package org.problem.solving.BOJ.Java11054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N + 1];
        int ans = Integer.MIN_VALUE;

        // 고점을 i로 설정
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp, 0); // DP 배열 초기화

            for (int j = 0; j < N; j++) { // 배열을 순회
                if (i > j && arr[i] > arr[j]) { // 고점까지 증가하는 경우
                    for (int k = 0; k < j; k++) {
                        if (arr[k] < arr[j]) { // 증가 조건을 만족
                            dp[j + 1] = Math.max(dp[j + 1], dp[k + 1] + 1);
                        }
                    }
                } else if (i < j && arr[i] < arr[j]) { // 고점을 넘어 감소하는 경우
                    for (int k = i; k < j; k++) {
                        if (arr[k] > arr[j]) { // 감소 조건을 만족
                            dp[j + 1] = Math.max(dp[j + 1], dp[k + 1] + 1);
                        }
                    }
                } else if (i == j) { // 고점의 경우
                    dp[j + 1] = dp[j] + 1; // 항상 길이를 증가
                } else {
                    dp[j + 1] = dp[j]; // 유지
                }
            }

            // 고점 i를 기준으로 계산된 최대 길이 갱신
            ans = Math.max(ans, dp[N]);
        }

        // 결과 출력
        System.out.println(ans);
    }
}

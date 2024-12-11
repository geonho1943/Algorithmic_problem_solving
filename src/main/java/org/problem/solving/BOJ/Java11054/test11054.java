package org.problem.solving.BOJ.Java11054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int maxLength = 0;
        for (int i = 0; i < N; i++) { // 고점 지정
            int[] dp = new int[N];
            dp[0] = 1; // DP 초기화
            for (int j = 1; j < N; j++) {
                int maxDp = 0; // j 이전의 최대 DP 값
                for (int k = 0; k < j; k++) {
                    if ((j < i && arr[k] < arr[j]) || (j > i && arr[k] > arr[j]) || i == j ) {
                        maxDp = Math.max(maxDp, dp[k]);
                    }
                }
                dp[j] = maxDp + 1; // 가장 큰 DP 값에 +1
            }
            // 고점 i 기준 최댓값 갱신
            maxLength = Math.max(maxLength, dp[N - 1]);
        }
        System.out.println(maxLength);
    }
}
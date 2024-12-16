package org.problem.solving.BOJ.Java12852;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java12852_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        int[] idx = new int[N+1];
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= N; i++) { // 0, 1은 기본값 0임
            dp[i] = dp[i - 1] + 1;
            idx[i] = i - 1;
            if (i%3 == 0 && dp[i] > dp[i/3] + 1){ // dp[i] 기준 최소연산 비교
                dp[i] = dp[i/3] + 1;
                idx[i] = i/3;
            }
            if (i%2 == 0 && dp[i] > dp[i/2] + 1){ // dp[i] 기준 최소연산 비교
                dp[i] = dp[i/2] + 1;
                idx[i] = i/2;
            }
        }
        System.out.println(dp[N]);
        while (N>0){ // 연산 과정 연결
            sb.append(N +" ");
            N = idx[N];
        }
        System.out.println(sb);
    }
}
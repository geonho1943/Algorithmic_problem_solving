package org.problem.solving.BOJ.Java14606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java14606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = i-1 + dp[i-1];
        }
        System.out.println(dp[n]); // 반복문을 사용해봄
        System.out.println(dpMethod(n)); // 재귀 사용해봅
    }
    public static int dpMethod(int n) {
        if (n == 1) return 0;
        return (n - 1) + dpMethod(n - 1);
    }
}

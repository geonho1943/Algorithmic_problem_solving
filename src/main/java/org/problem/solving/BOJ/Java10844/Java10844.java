package org.problem.solving.BOJ.Java10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java10844 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int remainder = 1_000_000_000; // 10억
        int[][] dp = new int[N][12];
        for (int i = 2; i < 11; i++) {
            dp[0][i] = 1;
        }
        dp[0][1] = 0;
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < 11; j++) {
                dp[i][j] = ( dp[i-1][j-1] + dp[i-1][j+1] ) % remainder;
            }
        }
        int ans = 0;
        for (int i = 0; i < 12; i++) {
            ans = (ans + dp[N-1][i]) % remainder;
            // ans += (dp[N-1][i]) % remainder; += 사용시 sout에서 % 한번더 해줘야 함
        }
        System.out.println(ans);
    }
}
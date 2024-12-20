package org.problem.solving.BOJ.Java1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // % 15746
        // 점화식 : dp[i] = dp[i-2] + dp[i-1];
        // 메서드 없이 :
        if (N ==0) System.out.println(0);
        if (N ==1) System.out.println(1);
        else {
            int[] dp = new int[N];
            dp[0] = 1;
            dp[1] = 2;
            for (int i = 2; i < N; i++) {
                dp[i] = ( dp[i-1] + dp[i-2] ) % 15746;
            }
            System.out.println(dp[N-1] %15746);
        }
    }
}
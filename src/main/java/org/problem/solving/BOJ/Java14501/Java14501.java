package org.problem.solving.BOJ.Java14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java14501 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N];
        int[] P = new int[N];
        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N+1]; // 마지막 인덱스의 0을 사용해야 함
        for (int i = N-1; i >= 0; i--) {
            int time = N - i; // 남은 날짜
            if (time - T[i] >= 0){ // 상담 할 수 있는 경우
                int workToDay = P[i] + dp[i + T[i]];
                int waitForBetter = dp[i + 1];
                dp[i] = Math.max(workToDay, waitForBetter);
            }else {
                dp[i] = dp[i+1];
            }

        }
        System.out.println(dp[0]);
    }
}

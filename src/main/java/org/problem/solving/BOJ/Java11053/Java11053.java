package org.problem.solving.BOJ.Java11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11053 {
    static int[] arr;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        dp = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int maxLength = 1;
        dp[0] = 1;
        for (int i = 1; i < N; i++) {
            dp[i] = searchLength(i);
            maxLength = Math.max(dp[i], maxLength);
        }
        System.out.println(maxLength);

    }
    public static int searchLength(int i){
        int ans = 1;
        for (int j = i; j > 0; j--) {
            if (arr[i] > arr[j-1]){
                ans =  Math.max(dp[j-1]+1, ans);
            }
        }
        return ans;
    }
}

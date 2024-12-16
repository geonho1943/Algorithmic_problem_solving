package org.problem.solving.BOJ.Java9252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java9252_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        StringBuilder sb;
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) { // 탐색 하면서 dp 갱신
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        if (dp[str1.length()][str2.length()] == 0) { // 예외 대응
            System.out.println(0);
            return;
        }
        // 역탐색으로 LCS 탐색
        int x = str1.length();
        int y = str2.length();
        sb = new StringBuilder();
        while (x > 0 && y > 0){
            if (str1.charAt(x-1) == str2.charAt(y-1)){
                sb.append(str1.charAt(x-1));
                x--;
                y--;
            }
            else if (dp[x-1][y] == dp[x][y]) x--;
            else y--;
        }
        System.out.println(dp[str1.length()][str2.length()]);
        System.out.println(sb.reverse());
    }
}
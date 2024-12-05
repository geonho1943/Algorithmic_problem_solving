package org.problem.solving.BOJ.Java9251;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int[][] dp = new int[str1.length()+1][str2.length()+1];

        for (int i = 0; i < str1.length(); i++) {
            char iTemp = str1.charAt(i);
            for (int j = 0; j < str2.length(); j++) {
                char jTemp = str2.charAt(j);
                if (iTemp == jTemp) {
                    dp[i+1][j+1] = dp[i][j]+1;
                }else {
                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }
        System.out.println(dp[str1.length()][str2.length()]);
    }
}
        // ACAYKP
        // CAPCAK
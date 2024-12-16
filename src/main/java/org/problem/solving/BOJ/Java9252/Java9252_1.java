package org.problem.solving.BOJ.Java9252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java9252_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int ansSize = 0;
        String ans = "";
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for (int i = 1; i <= str1.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= str2.length(); j++) { // 탐색 하면서 dp 갱신
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
            for (int j = 1; j <= str2.length(); j++) { // 특정 i일때 LCS 도출
                if (dp[i][j] == dp[i][j-1] + 1){
                    sb.append(str2.charAt(j-1));
                }
            }
            if (ansSize < dp[i][str2.length()]){ // 최대 정보 갱신
                ansSize = dp[i][str2.length()];
                ans = String.valueOf(sb);
            }
        }
        if (ansSize == 0){
            System.out.println(0);
        } else {
            System.out.println(ansSize + "\n" + ans);
        }
    }
}
// dp값의 변화를 따라 LCS를 구하도록 구현
// dp 테이블은 i-1의 영향을 받음 : i가 고정되었을때 dp 값 변화는 의미가 없음 (LCS와 연관이 없음)
// 변화 탐지해서 i-n 로 이동, dp 값이 갱신 될 때의 답을 구해야 함
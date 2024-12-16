package org.problem.solving.BOJ.Java9252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java9252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        StringBuilder sb = new StringBuilder();
        int ansSize = 0;
        String ans = "";
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) { // 탐색 하면서 최댓값 전달
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j]++;
                    sb.append(str1.charAt(i-1));
                }
            }
            if (ansSize < dp[i][str2.length()]){ // 최대 정보 갱신
                ansSize = Math.max(ansSize, dp[i][str2.length()]);
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
// 점화식이 중복대응을 못함
//ACAYKP
//CAPCAK
//dp = {int[7][]@837}
// 0 = {int[7]@950} [0, 0, 0, 0, 0, 0, 0]
// 1 = {int[7]@951} [0, 0, 1, 1, 1, 2, 2]
// 2 = {int[7]@952} [0, 1, 1, 1, 2, 2, 2]
// 3 = {int[7]@953} [0, 1, 2, 2, 2, 3, 3]
// 4 = {int[7]@954} [0, 1, 2, 2, 2, 3, 3]
// 5 = {int[7]@955} [0, 1, 2, 2, 2, 3, 4]
// 6 = {int[7]@956} [0, 1, 2, 3, 3, 3, 4]

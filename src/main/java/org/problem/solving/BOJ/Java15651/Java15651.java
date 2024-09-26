package org.problem.solving.BOJ.Java15651;

import java.io.*;
import java.util.StringTokenizer;

public class Java15651 {
    static int N;
    static int M;
    static int[] ans;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 최대 길이
        M = Integer.parseInt(st.nextToken()); // 배열 길이
        sb = new StringBuilder();
        ans = new int[M];
        dfs(0);
        System.out.println(sb);
    }

    private static void dfs(int now) {
        if (now == M){
            for (int i = 0; i < M; i++) {
                sb.append(ans[i]+" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            ans[now] = i;
            dfs(now+1);
        }
    }
}
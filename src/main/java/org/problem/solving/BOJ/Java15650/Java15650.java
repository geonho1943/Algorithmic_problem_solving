package org.problem.solving.BOJ.Java15650;

import java.io.*;
import java.util.StringTokenizer;

public class Java15650 {
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
        dfs(0, 1);
    }

    private static void dfs(int now, int val) {
        if (now == M){
            for (int i = 0; i < M; i++) {
                sb.append(ans[i]+" ");
            }
            System.out.println(sb);
            sb.setLength(0);
            return;
        }
        for (int i = val; i <= N; i++) {
            ans[now] = i;
            dfs(now+1, i+1);
        }
    }
}

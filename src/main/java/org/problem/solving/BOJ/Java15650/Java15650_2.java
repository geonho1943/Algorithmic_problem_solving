package org.problem.solving.BOJ.Java15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java15650_2 {
    static int N;
    static int M;
    static StringBuilder sb;
    static int[] ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ans = new int[M];
        dfs(1,0);
        System.out.println(sb);
    }

    private static void dfs(int num, int place) {
        if (place == M){
            for (int i = 0; i < M; i++) {
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
        }else {
            for (int i = num; i <= N; i++) {
                ans[place] = i;
                dfs(i+1,place+1);
            }
        }
    }
}
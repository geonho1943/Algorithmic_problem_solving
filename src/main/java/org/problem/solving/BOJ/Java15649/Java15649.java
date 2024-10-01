package org.problem.solving.BOJ.Java15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java15649 {
    static int N;
    static int M;
    static int[] ans;
    static StringBuilder sb;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ans = new int[M+1];
        check = new boolean[N];
        dfs(1, 0);
        System.out.println(sb);
    }

    private static void dfs(int num, int place) {
        if (place == M){
            for (int i = 0; i < M; i++) {
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
        }else {
            for (int i = 0; i < N; i++) {
                if (!check[i]){
                    ans[place] = i+1;
                    check[i] = true;
                    dfs(num+1, place+1);
                    check[i] = false;
                }
            }
        }
    }
}
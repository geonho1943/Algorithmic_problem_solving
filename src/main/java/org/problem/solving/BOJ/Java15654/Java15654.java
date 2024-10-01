package org.problem.solving.BOJ.Java15654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java15654 {
    static int N;
    static int M;
    static StringBuilder sb;
    static int[] arr;
    static int[] ans;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        ans = new int[M];
        check = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb);
    }

    private static void dfs(int place) {
        if (place == M){
            for (int i = 0; i < M; i++) {
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
        }else {
            for (int i = 0; i < N; i++) {
                if (!check[i]){
                    ans[place] = arr[i];
                    check[i] = true;
                    dfs(place+1);
                    check[i] = false;
                }
            }
        }

    }
}

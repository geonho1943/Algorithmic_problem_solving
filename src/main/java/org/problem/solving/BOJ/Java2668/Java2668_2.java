package org.problem.solving.BOJ.Java2668;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java2668_2 {
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb;
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        visit = new boolean[N+1];
        for (int i = 0; i < N; i++){
            arr[i+1] = Integer.parseInt(br.readLine());
        }
        ans = 0;
        sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            visit[i] = true;
            dfs(i,arr[i]);
            visit[i] = false;
        }
        System.out.println(ans);
        System.out.println(sb);
    }

    private static void dfs(int startIdx, int currentIdx) {
        if (!visit[currentIdx]){
        visit[currentIdx] = true;
        dfs(startIdx, arr[currentIdx]);
        visit[currentIdx] = false;
        }
        if (startIdx == currentIdx){
            ans++;
            sb.append(startIdx+"\n");
        }
    }
}

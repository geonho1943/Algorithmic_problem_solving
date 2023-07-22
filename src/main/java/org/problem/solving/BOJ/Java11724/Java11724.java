package org.problem.solving.BOJ.Java11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Java11724 {
    static boolean[] visited;
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new ArrayList[N+1];
        for (int i = 1; i <N; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 1; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[u].add(v);
            arr[v].add(u);
        }
        visited = new boolean[N+1];
        int ans =0;

        for (int i = 1; i < N; i++) {
            if (!visited[i]){
                dfs(i);
                ans++;
            }
        }
        System.out.println(ans);
    }

    private static void dfs(int i) {
        visited[i] = true;
        for (int j = 0; j < arr[i].size(); j++) {
            int nextNode = arr[i].get(j);
            if (!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }
}

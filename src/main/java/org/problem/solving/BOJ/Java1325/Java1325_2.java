package org.problem.solving.BOJ.Java1325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java1325_2 {
    static HashMap<Integer, ArrayList<Integer>> graph;
    static boolean[] visited;
    static int[] ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new HashMap<>();
        ans = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int sNode = Integer.parseInt(st.nextToken());
            int eNode = Integer.parseInt(st.nextToken());
            graph.get(eNode).add(sNode); // A가 B를 신뢰하는것이 아니라 B가 A를 신뢰함
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }

        int maxCount = 0;
        for (int i = 1; i <= N; i++) {
            maxCount = Math.max(maxCount, ans[i]);
        }

        for (int i = 1; i <= N; i++) {
            if (ans[i] == maxCount) {
                System.out.print(i + " ");
            }
        }
    }

    // DP처럼 풀어본 DFS
    private static int dfs(int node) {
        if (visited[node]) return ans[node];
        visited[node] = true;
        ans[node] = 1;
        for (int nextNode : graph.get(node)) {
            ans[node] += dfs(nextNode);
        }
        return ans[node];
    }
}
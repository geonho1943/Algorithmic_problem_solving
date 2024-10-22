package org.problem.solving.BOJ.Java1325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java1325 { // 시간초과
    static HashMap<Integer, ArrayList<Integer>> graph;
    static boolean[] visited;
    static int[] ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new HashMap<>();
        ans = new int[N + 1]; // 하위 노드가 있을때마다 노드가 1씩 증가 하는 답 배열

        // 그래프 초기화
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<>());
        }

        // 단방향 그래프
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int sNode = Integer.parseInt(st.nextToken());
            int eNode = Integer.parseInt(st.nextToken());
            graph.get(sNode).add(eNode);
        }

        // 각 노드별 BFS 실행
        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            bfs(i);
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

    private static void bfs(int idx) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(idx);
        visited[idx] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int nextNode : graph.get(node)) {
                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    ans[nextNode]++;
                    queue.add(nextNode);
                }
            }
        }
    }
}
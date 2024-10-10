package org.problem.solving.BOJ.Java1197;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java1197 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        List<int[]>[] arr = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr[a].add(new int[]{b, c});
            arr[b].add(new int[]{a, c});
        }
        boolean[] visited = new boolean[V + 1];
        PriorityQueue<int[]> que = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        que.add(new int[]{1, 0});
        int weightSum = 0;

        while (!que.isEmpty()) {
            int[] current = que.poll();
            int node = current[0];
            int weight = current[1];
            if (visited[node]) continue;

            visited[node] = true;
            weightSum += weight;

            for (int[] edge : arr[node]) {
                int nextNode = edge[0];
                int nextWeight = edge[1];
                if (!visited[nextNode]) {
                    que.add(new int[]{nextNode, nextWeight});
                }
            }
        }
        System.out.println(weightSum);
    }
}
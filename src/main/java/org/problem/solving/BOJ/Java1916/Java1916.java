package org.problem.solving.BOJ.Java1916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java1916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new int[] {v, w}); // 시작정점 > 도착정점 의 가중치 저장
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int[] shotCut = new int[N+1];
        Arrays.fill(shotCut, Integer.MAX_VALUE);
        shotCut[start] = 0;
        boolean[] visited = new boolean[N+1];

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1])); // 가중치를 오름차순 하도록 수정
        pq.offer(new int[] {start, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            if (visited[current[0]]) continue; // 이미 방문했으면 건너뜀
            else visited[current[0]] = true;

            for (int[] edge : graph.get(current[0])) {
                int nextNode = edge[0];
                int nextCost = current[1] + edge[1];
                if (nextCost < shotCut[nextNode]) {
                    shotCut[nextNode] = nextCost;
                    pq.offer(new int[] {nextNode, nextCost});
                }
            }
        }
        System.out.println(shotCut[end]);
    }
}
package org.problem.solving.BOJ.Java1753;

import java.io.*;
import java.util.*;

public class Java1753_2 {
    static final int INF = 100000000;
    static List<int[]>[] graph;
    static int[] dist;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());
        graph = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new int[]{v, w});
        }
        dist = new int[V + 1];
        visited = new boolean[V + 1];
        Arrays.fill(dist, INF);
        dist[K] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{K, 0});
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int now = current[0];
            int nowDist = current[1];
            if (visited[now]) continue;
            visited[now] = true;
            for (int[] edge : graph[now]) {
                int next = edge[0];
                int nextDist = nowDist + edge[1];
                if (nextDist < dist[next]) { // 짧은 거리 갱신
                    dist[next] = nextDist;
                    pq.add(new int[]{next, nextDist});
                }
            }
        }
        for (int i = 1; i <= V; i++) {
            if (dist[i] == INF) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }
    }
}
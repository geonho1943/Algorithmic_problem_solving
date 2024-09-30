package org.problem.solving.BOJ.Java1753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Java1753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int INF = 100000000;
        int[][] graph = new int[V+1][V+1];
        for (int i = 1; i <= V; i++) {
            Arrays.fill(graph[i], INF);
        }
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        // 간선 정보 입력 (E개의 간선)
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u][v] = Math.min(w, graph[u][v]); // 두 노드 사이의 간선이 여러 개일 수 있으므로 최소값으로 설정
        }

        // 다익스트라 시작
        int[] dist = new int[V+1];
        boolean[] visited = new boolean[V+1]; // 방문한 노드를 기록하기 위한 배열
        Arrays.fill(dist, INF);
        dist[K] = 0;
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        queue.add(new int[]{K, 0}); // (노드, 거리) 형태로 큐에 추가

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int now = current[0];
            int nowDist = current[1];

            if (visited[now]) continue; // 이미 방문한 노드는 건너뛴다
            visited[now] = true; // 현재 노드를 방문 처리

            // 인접한 노드를 탐색
            for (int next = 1; next <= V; next++) {
                if (graph[now][next] != INF) { // 연결된 노드인 경우만 처리
                    int newDist = nowDist + graph[now][next];

                    // 최단 경로 갱신
                    if (newDist < dist[next]) {
                        dist[next] = newDist;
                        queue.add(new int[]{next, newDist});
                    }
                }
            }
        }

        // 결과 출력 (1번부터 V번까지의 노드에 대해 최단 거리 출력)
        for (int i = 1; i <= V; i++) {
            if (dist[i] != INF) {
                System.out.println(dist[i]);
            } else {
                System.out.println("INF");
            }
        }
    }
}
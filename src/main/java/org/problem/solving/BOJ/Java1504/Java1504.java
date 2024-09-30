package org.problem.solving.BOJ.Java1504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java1504 {
    static Map<Integer, List<int[]>> graph;
    static Map<Integer, List<Integer[]>> visitedGraph;
    static final int INF = 200000000;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        graph = new HashMap<>();
        visitedGraph = new HashMap<>();
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph.putIfAbsent(node1, new ArrayList<>());
            graph.putIfAbsent(node2, new ArrayList<>());
            graph.get(node1).add(new int[] {node2, cost});
            graph.get(node2).add(new int[] {node1, cost});
        }
        st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());
        // v1 >> v2 == v2 >> v1 두 값은 동일함
        int common = shortCut(v1, v2); // v1 먼저 방문 할때 1 >> v1 + v2 >> N
        int v1First = shortCut(1,v1); // v2 먼저 방문 할때 1 >> v2 + v1 >> N
        int v2End = shortCut(v2,N);
        int v2First = shortCut(1,v2); // 둘중 작은 값 + (v1,v2 가중치)
        int v1End = shortCut(v1,N);
        // 최단거리 매서드 5번 사용
        if (common >= INF || v1First >= INF || v2End >= INF || v2First >= INF || v1End >= INF) {
            System.out.println(-1);
        } else {
            System.out.println(common + Math.min(v1First + v2End, v2First + v1End));
        }
    }
    private static int shortCut(int node1, int node2) {
        PriorityQueue<int[]> priQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[1])); // 가중치 오름차순
        int[] dist = new int[N + 1]; // 최단 거리 저장
        Arrays.fill(dist, INF);  // 최댓값으로 초기화
        dist[node1] = 0;
        priQueue.add(new int[] {node1, 0});
        while (!priQueue.isEmpty()) {
            int[] now = priQueue.poll();
            int nowNode = now[0];
            int nowDist = now[1];
            if (nowDist > dist[nowNode]) continue; // 이미 방문한 노드인 경우
            // 인접한 노드를 탐색
            for (int[] edge : graph.getOrDefault(nowNode, new ArrayList<>())) {
                int nextNode = edge[0];
                int edgeCost = edge[1];
                int newDist = nowDist + edgeCost;
                // 최단 경로 갱신
                if (newDist < dist[nextNode]) {
                    dist[nextNode] = newDist;
                    priQueue.add(new int[] {nextNode, newDist});
                }
            }
        }return dist[node2];
    }
}
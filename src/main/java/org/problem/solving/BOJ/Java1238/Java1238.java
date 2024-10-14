package org.problem.solving.BOJ.Java1238;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java1238 {
    static HashMap<Integer, ArrayList<int[]>> graph;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        graph = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int sv = Integer.parseInt(st.nextToken()); // 시작 노드
            int ev = Integer.parseInt(st.nextToken()); // 도착 노드
            int weight = Integer.parseInt(st.nextToken()); // 가중치
            graph.get(sv).add(new int[]{ev, weight}); // 단방향 그래프
        }

        int maxWeight = 0;
        for (int i = 1; i <= N; i++) {
            // 각 노드에서 X까지 최단 거리 구하기
            int sum = bfs(i, X) + bfs(X, i);
            // 각 노드의 최소 거리 중 가장 큰 값 갱신
            maxWeight = Math.max(maxWeight, sum);
        }

        System.out.println(maxWeight);
    }

    private static int bfs(int startNode, int goal) {
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[startNode] = 0; // 시작 노드는 거리 0

        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        queue.add(new int[]{startNode, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentNode = current[0];
            int currentDist = current[1];

            if (currentDist > dist[currentNode]) continue; // 이미 더 짧은 경로가 있을 경우 무시

            // 현재 노드에서 연결된 모든 이웃 노드 탐색
            for (int[] neighbor : graph.get(currentNode)) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];
                int newDist = dist[currentNode] + weight;

                // 더 짧은 경로를 발견하면 업데이트하고 큐에 삽입
                if (newDist < dist[nextNode]) {
                    dist[nextNode] = newDist;
                    queue.add(new int[]{nextNode, newDist});
                }
            }
        }
        return dist[goal]; // 목표 지점까지의 최단 거리 반환
    }
}
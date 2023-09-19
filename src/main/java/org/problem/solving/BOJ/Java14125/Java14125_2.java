package org.problem.solving.BOJ.Java14125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java14125_2 {
    static int N;
    static int[][] blocks;
    static final int INF = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        blocks = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            blocks[i][0] = Integer.parseInt(st.nextToken());
            blocks[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.println(dijkstra());
    }

    private static int dijkstra() {
        int source = N;
        int destination = N + 1;

        int[][] graph = buildGraph();
        int[] dist = new int[N + 2];
        Arrays.fill(dist, INF);
        dist[source] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.offer(new int[]{0, source});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int cost = current[0];
            int node = current[1];

            if (dist[node] < cost) {
                continue;
            }

            for (int i = 0; i < N + 2; i++) {
                int newCost = cost + graph[node][i];
                if (newCost < dist[i]) {
                    dist[i] = newCost;
                    pq.offer(new int[]{newCost, i});
                }
            }
        }

        return dist[destination];
    }

    private static int[][] buildGraph() {
        int[][] graph = new int[N + 2][N + 2];
        int source = N;
        int destination = N + 1;

        for (int i = 0; i < N; i++) {
            graph[source][i] = 0;
            graph[i][destination] = 0;

            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }

                if (blocks[i][0] != blocks[j][0]) {
                    int heightDiff = Math.abs(blocks[i][1] - blocks[j][1]);
                    graph[i][j] = heightDiff;
                } else {
                    graph[i][j] = INF;
                }
            }
        }

        return graph;
    }
}

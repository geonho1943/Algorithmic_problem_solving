package org.problem.solving.BOJ.Java2644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java2644_2 {
    static int N;
    static int staerNode;
    static int endNode;
    static HashMap<Integer, ArrayList<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        staerNode = Integer.parseInt(st.nextToken());
        endNode = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(br.readLine());
        graph = new HashMap<>();
        visited = new boolean[N+1];
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int startNode = Integer.parseInt(st.nextToken());
            int endNode = Integer.parseInt(st.nextToken());
            graph.get(startNode).add(endNode);
            graph.get(endNode).add(startNode); // 양방향
        }
        System.out.println(BFS(staerNode,endNode));
    }

    private static int BFS(int startNode, int endNode) {
        int[] dist = new int[N+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        visited[startNode] = true;
        dist[startNode] = 0;
        while (!queue.isEmpty()){
            int currentNode = queue.poll();
            if (currentNode == endNode){
                return dist[endNode];
            }
            ArrayList<Integer> next = graph.get(currentNode);
            for (int i = 0; i < next.size(); i++) {
                int nextNode = next.get(i);
                if (!visited[nextNode]){
                    visited[nextNode] = true;
                    queue.add(nextNode);
                    dist[nextNode] = dist[currentNode]+1;
                }
            }

        }
        return -1;
    }
}
package org.problem.solving.BOJ.Java2644;

import java.io.*;
import java.util.*;

public class Java2644 { // 너무 복잡하게 생각했다
    static HashMap<Integer, ArrayList<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int me = Integer.parseInt(st.nextToken());
        int you = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(br.readLine());
        graph = new HashMap<>();
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

        int[] myRelation = searchRoot(me, N);
        int[] youRelation = searchRoot(you, N);

        // A와 B 중 작은 값을 기준으로 비교
        int limit = Math.min(me, you);
        for (int i = limit; i > 0; i--) {
            if (myRelation[i] != 0 && youRelation[i] != 0) { // 공통 조상 찾기
                System.out.println(myRelation[i] + youRelation[i]);
                return;
            }
        }
        System.out.println(-1); // 공통 조상이 없을 경우
    }

    private static int[] searchRoot(int start, int N) {
        int[] relation = new int[N + 1]; // 각 노드의 촌수를 저장하는 배열
        Queue<Integer> queue = new LinkedList<>();
        visited = new boolean[N + 1];
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            ArrayList<Integer> next = graph.get(temp);
            for (int i = 0; i < next.size(); i++) {
                int neighbor = next.get(i);
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    relation[neighbor] = relation[temp] + 1; // 촌수 증가
                }
            }
        }
        return relation;
    }
}

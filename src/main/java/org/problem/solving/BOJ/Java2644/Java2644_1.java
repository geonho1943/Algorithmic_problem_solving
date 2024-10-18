package org.problem.solving.BOJ.Java2644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java2644_1 {
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
        visited = new boolean[N + 1];
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

        // 노드 수가 큰 값부터 1에 가까워질 수록 조상
        // 1 에서 가장멀리 있는 공통조상의 값 합이 정답
        for (int i = Math.min(me, you); i >= 1; i--) { //
            if (myRelation[i] != 0 && youRelation[i] != 0) {
                System.out.println(myRelation[i] + youRelation[i]);
                return;
            }
        }
        System.out.println(-1);
    }

    private static int[] searchRoot(int start, int N) {
        int[] relation = new int[N + 1];
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            ArrayList<Integer> next = graph.get(temp);
            for (int neighbor : next) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    relation[neighbor] = relation[temp] + 1;
                }
            }
        }
        return relation;
    }
}
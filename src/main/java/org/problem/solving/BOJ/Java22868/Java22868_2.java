package org.problem.solving.BOJ.Java22868;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java22868_2 {
    public static int N, M;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static int S, E;
    public static boolean[] check;
    public static int[] visitedNodeCheck;
    public static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        check = new boolean[N + 1];
        visitedNodeCheck = new int[N + 1];

        // 그래프 초기화
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int nodeA = Integer.parseInt(st.nextToken());
            int nodeB = Integer.parseInt(st.nextToken());

            graph.get(nodeA).add(nodeB);
            graph.get(nodeB).add(nodeA);
        }

        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        // 간선들을 사전순으로 정렬
        for (int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        // S -> E로 가는 경로 탐색
        BFS(S, E);

        // 방문 배열 초기화
        Arrays.fill(check, false);

        // 경로 복원하면서 방문 처리
        int currentNode = visitedNodeCheck[E];
        while (currentNode > 0) {
            check[currentNode] = true;
            currentNode = visitedNodeCheck[currentNode];
        }

        check[S] = false;  // 시작점은 다시 방문 가능

        // E -> S로 가는 경로 탐색
        BFS(E, S);

        // 결과 출력
        System.out.println(result);
    }

    // BFS 함수
    public static void BFS(int start, int end) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, 0});
        check[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentNode = current[0];
            int currentDist = current[1];

            for (int nextNode : graph.get(currentNode)) {
                if (!check[nextNode]) {
                    check[nextNode] = true;
                    visitedNodeCheck[nextNode] = currentNode;
                    queue.offer(new int[]{nextNode, currentDist + 1});
                    if (nextNode == end) {
                        result += currentDist + 1;
                        return;
                    }
                }
            }
        }
    }
}

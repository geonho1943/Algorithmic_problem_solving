package org.problem.solving.BOJ.Java1707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Java1707 {
    static boolean stopper;
    static HashMap<Integer, List<Integer>> graph;
    static int[] nodeCount;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for (int k = 0; k < K; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            graph = new HashMap<>();
            check = new boolean[V + 1]; // 방문 여부 초기화
            nodeCount = new int[V + 1]; // 각 노드의 깊이 저장
            stopper = false;
            for (int i = 1; i <= V; i++) {
                graph.put(i, new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int startNode = Integer.parseInt(st.nextToken());
                int endNode = Integer.parseInt(st.nextToken());
                graph.get(startNode).add(endNode);
                graph.get(endNode).add(startNode);
            }
            for (int i = 1; i <= V; i++) {
                if (!check[i]) {
                    dfs(i, 0);
                    if (stopper) break; // 이분 그래프가 아니면 탐색 중단
                }
            }
            System.out.println(stopper ? "NO" : "YES");
        }
    }
    private static void dfs(int startNode, int length) {
        check[startNode] = true; // 방문 처리
        nodeCount[startNode] = length; // 해당 노드의 깊이 저장
        // 1: N 대응
        for (int i = 0; i < graph.get(startNode).size(); i++) {
            if (!check[graph.get(startNode).get(i)]) {
                dfs(graph.get(startNode).get(i),length + 1);
//                check[graph.get(startNode).get(i)] = false; // 다른 노드를 탐색 하기 위해 방문기록 삭제
                // dfs 이기 때문에 부분 순환 그래프를 위한 방문체크 데이터는 꼬이지 않는다

            } else {
                // 이미 방문한 노드일 경우 - 부분 순환 그래프
                int loopNodeCount = length - nodeCount[graph.get(startNode).get(i)] + 1;
                if (loopNodeCount % 2 == 1) {
                    stopper = true; //한 부분이라도 이분 그래프가 아니면 탐색을 멈춤
                    return;
                }
            }
        }
    }
}
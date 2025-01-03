package org.problem.solving.BOJ.Java20040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Java20040 {
    static List<List<Integer>> graph; // 그래프 인접 리스트
    static boolean[] visit; // 방문 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        int ansCount = 0;
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 각 턴 마다 실시간으로 게임 종료 확인
            visit = new boolean[N];
            if (dfs(a, b)) {
                ansCount = i;
                break;
            }
            // 연결되어 있지 않았다면 간선을 그래프에 추가
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        System.out.println(ansCount);
    }

    // DFS로 start에서 end까지 경로가 있는지 확인
    static boolean dfs(int s, int e) {
        if (visit[s]) return false; // 이미 탐색된 그래프
        visit[s] = true;
        if (s == e) { // 사이클 발견
            return true;
        }

        for (int next : graph.get(s)) {
            if (!visit[next]) {
                if (dfs(next, e)) { // 인접 그래프 DFS 탐색
                    return true;
                }
            }
        }
        return false;
    }
}

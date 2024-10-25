package org.problem.solving.BOJ.Java1647;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java1647_AI {
    // AI 가 생성한 코드
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<int[]> infoW = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            infoW.add(i, new int[]{c,a,b}); //하나의 가중치를 a,b 와 함깨 저장
        }
        infoW.sort(Comparator.comparingInt(e -> e[0]));// 가중치를 기준으로 정렬
        parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }

        int mstCost = 0;
        int maxEdge = 0; // 가장 큰 가중치 간선 추적

        // Kruskal 알고리즘
        for (int[] curInfo : infoW) {
            int weight = curInfo[0];
            int v = curInfo[1];
            int u = curInfo[2];

            if (find(u) != find(v)) {
                union(u, v);
                mstCost += weight;
                maxEdge = weight; // 현재 간선이 MST에 포함된 가장 큰 가중치 간선
            }
        }

        // 두 마을로 분리된 MST 비용 출력
        System.out.println(mstCost - maxEdge);
    }

    // Union-Find의 find 함수
    static int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    // Union-Find의 union 함수
    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            parent[b] = a;
        }
    }
}
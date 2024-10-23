package org.problem.solving.BOJ.Java25516;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Java25516 {
    static int K;
    static int[] apple;
    static HashMap<Integer, LinkedList<Integer>> T;
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        T = new HashMap<>();
        for (int i = 0; i < N; i++) {
            T.put(i, new LinkedList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            T.get(parent).add(child);
        }
        st = new StringTokenizer(br.readLine());
        apple = new int[N];
        for (int i = 0; i < N; i++) { // 사과 갯수 입력
            apple[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0,0); // 정점 노드 번호 0, 거리 0 부터 시작 > ans 를 갱신함
        System.out.println(ans);
    }

    private static void dfs(int node, int dist) {
        if (dist > K){
            return;
        }else {
            // 현재 노드의 사과 수 ans 에 더하기
            ans += apple[node];
            // 다음 노드,거리 +1 값을 재귀 호출
            LinkedList<Integer> nextNode = T.get(node);
            for (int i = 0; i < nextNode.size(); i++) {
                dfs(nextNode.get(i), dist+1);
            }
        }
    }
}
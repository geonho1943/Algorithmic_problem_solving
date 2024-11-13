package org.problem.solving.BOJ.Java2252;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java2252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1]; // 진입 차수 배열
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            arr[b]++; // 노드 b 에 대한 진입 차수 저장
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            if (arr[i] == 0) { // 진입 차수가 없는 노드 먼저 큐에 추가
                queue.offer(i);
            }
        }

        // 위상정렬 / BFS
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int current = queue.poll();
            result.add(current);

            // 현재 노드와 연결된 노드의 진입 차수 감소
            for (int next : graph.get(current)) {
                arr[next]--;
                // 모든 노드를 탐색 후 진입 차수가 0이 된 노드를 큐에 추가
                if (arr[next] == 0) {
                    queue.offer(next);
                }
            }
        }
        for (int student : result) {
            bw.write(student + " ");
        }
    }
}
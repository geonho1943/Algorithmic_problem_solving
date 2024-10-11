package org.problem.solving.BOJ.Java1005;

import java.io.*;
import java.util.*;

public class Java1005 {
    static List<List<Integer>> arr;
    static int[] time, dp;
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            time = new int[N + 1];
            dp = new int[N + 1]; // 최소 시간 저장
            arr = new ArrayList<>();

            for (int i = 0; i <= N; i++) {
                arr.add(new ArrayList<>());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                time[i] = Integer.parseInt(st.nextToken());
            }

            int[] inDegree = new int[N + 1]; // 진입 차수 배열
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr.get(a).add(b);
                inDegree[b]++;
            }
            int W = Integer.parseInt(br.readLine());

            System.out.println(topologicalSort(W, inDegree)); // 위상정렬
        }
    }

    private static int topologicalSort(int W, int[] inDegree) {
        Queue<Integer> que = new LinkedList<>();
        int[] result = new int[N + 1]; //최소시간 저장용

        for (int i = 1; i <= N; i++) {
            result[i] = time[i]; // 지금건물 시간 저장
            if (inDegree[i] == 0) {
                que.offer(i);
            }
        }
        while (!que.isEmpty()) {
            int current = que.poll();
            for (int next : arr.get(current)) {
                result[next] = Math.max(result[next], result[current] + time[next]); // 최대 시간 계산
                inDegree[next]--;
                if (inDegree[next] == 0) {
                    que.offer(next);
                }
            }
        }
        return result[W];
    }
}
package org.problem.solving.BOJ.Java1389;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java1389hashSet {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt(); // 유저의 수
            int M = scanner.nextInt(); // 친구 관계의 수

            HashSet<Integer>[] graph = new HashSet[N+1]; // 유저 그래프
            int[] baconNumber = new int[N+1]; // 케빈 베이컨 수

            for (int i = 1; i <= N; i++) {
                graph[i] = new HashSet<>();
            }

            // 친구 관계 입력
            for (int i = 0; i < M; i++) {
                int A = scanner.nextInt();
                int B = scanner.nextInt();
                graph[A].add(B);
                graph[B].add(A);
            }

            int minBaconNumber = Integer.MAX_VALUE;
            int minUser = 0;

            // 모든 유저에 대해 BFS 수행
            for (int i = 1; i <= N; i++) {
                boolean[] visited = new boolean[N+1];
                int[] distance = new int[N+1];
                Queue<Integer> queue = new LinkedList<>();

                visited[i] = true;
                queue.offer(i);

                while (!queue.isEmpty()) {
                    int current = queue.poll();

                    for (int friend : graph[current]) {
                        if (!visited[friend]) {
                            visited[friend] = true;
                            distance[friend] = distance[current] + 1;
                            queue.offer(friend);
                        }
                    }
                }

                int sum = 0;
                for (int j = 1; j <= N; j++) {
                    sum += distance[j];
                }

                baconNumber[i] = sum;

                if (baconNumber[i] < minBaconNumber) {
                    minBaconNumber = baconNumber[i];
                    minUser = i;
                }
            }

            System.out.println(minUser);
        }
}

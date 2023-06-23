package org.problem.solving.BOJ.Java1389;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java1389arrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 유저의 수
        int M = scanner.nextInt(); // 친구 관계의 수

        // 유저 그래프 생성
        ArrayList<Integer>[] graph = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 케빈 베이컨 수를 저장할 배열
        int[] baconNumber = new int[N+1];

        // 친구 관계 입력
        for (int i = 0; i < M; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // 양방향 친구 관계로 연결
            graph[A].add(B);
            graph[B].add(A);
        }

        int minBaconNumber = Integer.MAX_VALUE;
        int minUser = 0;

        // 모든 유저에 대해 BFS 수행
        for (int i = 1; i <= N; i++) {
            boolean[] visited = new boolean[N+1]; // 방문 여부를 저장하는 배열
            int[] distance = new int[N+1]; // 시작 유저로부터의 거리를 저장하는 배열
            Queue<Integer> queue = new LinkedList<>();

            visited[i] = true; // 시작 유저를 방문 처리
            queue.offer(i); // 시작 유저를 큐에 삽입

            while (!queue.isEmpty()) {
                int current = queue.poll();

                // 현재 유저의 친구들을 탐색
                for (int friend : graph[current]) {
                    if (!visited[friend]) { // 아직 방문하지 않은 친구라면
                        visited[friend] = true; // 방문 처리
                        distance[friend] = distance[current] + 1; // 거리 갱신
                        queue.offer(friend); // 큐에 삽입
                    }
                }
            }

            int sum = 0;
            for (int j = 1; j <= N; j++) {
                sum += distance[j]; // 시작 유저로부터 모든 유저까지의 거리를 누적
            }

            baconNumber[i] = sum; // 케빈 베이컨 수 저장

            if (baconNumber[i] < minBaconNumber) {
                minBaconNumber = baconNumber[i];
                minUser = i;
            }
        }

        System.out.println(minUser); // 케빈 베이컨 수가 가장 작은 유저 출력
    }
}
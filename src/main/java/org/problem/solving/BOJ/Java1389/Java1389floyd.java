package org.problem.solving.BOJ.Java1389;

import java.util.Arrays;
import java.util.Scanner;

public class Java1389floyd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 유저의 수
        int M = scanner.nextInt(); // 친구 관계의 수

        int[][] graph = new int[N+1][N+1]; // 유저 그래프
        int[] baconNumber = new int[N+1]; // 케빈 베이컨 수

        // 그래프 초기화
        for (int i = 1; i <= N; i++) {
            Arrays.fill(graph[i], 10001); // 최대값으로 초기화
            graph[i][i] = 0;
        }

        // 친구 관계 입력
        for (int i = 0; i < M; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            graph[A][B] = 1;
            graph[B][A] = 1;
        }

        // 플로이드-와샬 알고리즘을 이용하여 최단 경로 계산
        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                }
            }
        }

        // 케빈 베이컨 수 계산
        int minBaconNumber = Integer.MAX_VALUE;
        int minUser = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j <= N; j++) {
                sum += graph[i][j];
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
package org.problem.solving.BOJ.Java2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java2667 {
    static boolean[][] visitedMap;
    static int[][] map;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visitedMap = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        // 단지 크기를 저장하는 리스트
        List<Integer> complexSizes = new ArrayList<>();

        // 모든 좌표에 대해 탐색 시작
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 아직 방문하지 않았고, 집(1) 이 있는 경우 BFS 탐색
                if (map[i][j] == 1 && !visitedMap[i][j]) {
                    complexSizes.add(mapBfs(i, j)); // 단지크기 를 리스트에 추가
                }
            }
        }

        // 단지 크기를 오름차순 정렬
        Collections.sort(complexSizes);

        // 결과 출력
        System.out.println(complexSizes.size()); // 총 단지 수
        for (int size : complexSizes) {
            System.out.println(size); // 각 단지의 크기
        }
    }

    // BFS를 이용해 단지의 크기를 구하는 함수
    private static int mapBfs(int startX, int startY) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{startX, startY});
        visitedMap[startX][startY] = true; // 방문 체크
        int size = 1; // 단지의 크기 초기값

        while (!que.isEmpty()) {
            int[] xy = que.poll();
            // 상하좌우 체크 후 이동할 좌표 큐에 저장
            for (int i = 0; i < 4; i++) {
                int newX = xy[0] + moveX[i];
                int newY = xy[1] + moveY[i];
                // map이 1(이동 가능할 경우), 방문한 적 없는 경우, 좌표를 벗어나지 않음
                if (newX >= 0 && newY >= 0 && newX < n && newY < n &&
                        map[newX][newY] == 1 && !visitedMap[newX][newY]) {
                    que.add(new int[]{newX, newY});
                    visitedMap[newX][newY] = true;
                    size++; // 단지 크기 증가
                }
            }
        }
        return size; // 단지의 크기 반환
    }
}
package org.problem.solving.BOJ.Java2206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java2206_2 {
    static int[][] arr;
    static boolean[][][] visit; // [x][y][벽뚫사용여부]
    static Queue<int[]> que;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        String row;
        for (int i = 0; i < N; i++) {
            row = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = row.charAt(j) - '0';
            }
        }
        visit = new boolean[N][M][2]; // 벽뚫 여부를 포함한 방문 체크
        que = new LinkedList<>();
        que.add(new int[]{0, 0, 0, 0}); // {x, y, 벽뚫사용여부, 이동횟수}
        System.out.println(bfs());
    }

    private static int bfs() {
        int[] ud = {1, -1, 0, 0};
        int[] lr = {0, 0, -1, 1};
        int[] current;
        while (!que.isEmpty()) {
            current = que.poll();
            // 종료 상황 처리
            if (current[0] == arr.length - 1 && current[1] == arr[0].length - 1) {
                return current[3] + 1;
            }
            // 상하좌우 이동
            for (int i = 0; i < 4; i++) {
                int x = current[0] + ud[i];
                int y = current[1] + lr[i];
                // arr 범위 체크
                if (x >= 0 && x < arr.length && y >= 0 && y < arr[0].length) {
                    // 벽을 뚫지 않은 경우 방문 체크
                    if (arr[x][y] == 0 && !visit[x][y][current[2]]) {
                        visit[x][y][current[2]] = true;
                        que.add(new int[]{x, y, current[2], current[3] + 1});
                    }
                    // 벽을 뚫는 경우 방문 체크
                    else if (arr[x][y] == 1 && current[2] == 0 && !visit[x][y][1]) {
                        visit[x][y][1] = true;
                        que.add(new int[]{x, y, 1, current[3] + 1});
                    }
                }
            }
        }
        return -1;
    }
}
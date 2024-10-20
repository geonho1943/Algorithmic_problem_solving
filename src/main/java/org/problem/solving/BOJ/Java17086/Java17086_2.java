package org.problem.solving.BOJ.Java17086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java17086_2 {
    static int N;
    static int M;
    static int[][] ans;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        ans = new int[N][M];
        Queue<int[]> que = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1) {
                    que.add(new int[]{i, j}); // 상어 위치를 큐에 모두 추가
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        bfs(que);
        int maxAns = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                maxAns = Math.max(maxAns, ans[i][j]);
            }
        }
        System.out.println(maxAns);
    }

    private static void bfs(Queue<int[]> que) {
        int[] moveX = {1, 1, 1, -1, -1, -1, 0, 0};
        int[] moveY = {0, 1, -1, 0, 1, -1, 1, -1};
        while (!que.isEmpty()) {
            int[] current = que.poll();
            int x = current[0];
            int y = current[1];
            for (int k = 0; k < 8; k++) {
                int nx = x + moveX[k];
                int ny = y + moveY[k];
                // 범위안, 짧은거리 갱신 가능
                if (nx >= 0 && nx < N &&
                    ny >= 0 && ny < M &&
                    ans[nx][ny] > ans[x][y] + 1){
                    ans[nx][ny] = ans[x][y] + 1;
                    que.add(new int[]{nx, ny});
                }
            }
        }
    }
}
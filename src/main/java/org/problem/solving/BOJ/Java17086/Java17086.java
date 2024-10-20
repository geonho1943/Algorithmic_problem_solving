package org.problem.solving.BOJ.Java17086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java17086 {
    // 29퍼센트 에서 틀림
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
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 1){
                    bfs(i,j);
                }
            }
        }
        int maxAns = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                maxAns = Math.max(maxAns, ans[i][j]);
            }
        }
        System.out.println(maxAns);
    }

    private static void bfs(int i, int j) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[] {i, j});
        ans[i][j] = 0;
        boolean[][] visited = new boolean[N][M];
        visited[i][j] = true;
        int[] moveX = {1,1,1,-1,-1,-1,0,0};
        int[] moveY = {0,1,-1,0,1,-1,1,-1};
        while (!que.isEmpty()){
            int[] current = que.poll();
            int x = current[0];
            int y = current[1];
            for (int k = 0; k < 8; k++) {
                if (moveX[k]+x >= 0 && moveX[k]+x < N &&
                    moveY[k]+y >= 0 && moveY[k]+y < M &&
                    !visited[moveX[k]+x][moveY[k]+y]){
                    visited[moveX[k]+x][moveY[k]+y] = true;
                    if (ans[moveX[k]+x][moveY[k]+y] != 0){
                        ans[moveX[k]+x][moveY[k]+y] = Math.min(ans[x][y]+1, ans[moveX[k]+x][moveY[k]+y]);
                    }else ans[moveX[k]+x][moveY[k]+y] = ans[x][y] + 1;
                    que.add(new int[] {moveX[k]+x, moveY[k]+y});
                }
            }
        }

    }
}
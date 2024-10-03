package org.problem.solving.BOJ.Java15686;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java15686 {
    static int N;
    static int M;
    static int[][] arr;
    static boolean[][] check;
    static int sum;
    static int temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j]==1){
                    check = new boolean[N][N];
                    temp = 0;
                    bfs(i,j);
                }
            }
        }
        System.out.println(sum);
    }

    private static void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 0});
        check[startX][startY] = true;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];
            if (arr[x][y] == 2) {
                sum += distance;
                return;
            }
            if (x + 1 < N && !check[x + 1][y]) {
                check[x + 1][y] = true;
                queue.add(new int[]{x + 1, y, distance + 1});
            }
            if (x - 1 >= 0 && !check[x - 1][y]) {
                check[x - 1][y] = true;
                queue.add(new int[]{x - 1, y, distance + 1});
            }
            if (y + 1 < N && !check[x][y + 1]) {
                check[x][y + 1] = true;
                queue.add(new int[]{x, y + 1, distance + 1});
            }
            if (y - 1 >= 0 && !check[x][y - 1]) {
                check[x][y - 1] = true;
                queue.add(new int[]{x, y - 1, distance + 1});
            }
        }
    }
}
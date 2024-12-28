package org.problem.solving.BOJ.Java2583;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java2583 {
    static boolean[][] area;
    static int temp;
    static int[] udlrX = {1, -1, 0, 0}; // 상하좌우
    static int[] udlrY = {0, 0, -1, +1};
    static int ansCount = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        area = new boolean[M][N];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    area[j][k] = true;
                }
            }
        }
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!area[i][j]){
                    temp = 0;
                    ansCount++;
                    DFS(i, j);
                    arr.add(temp);
                }
            }
        }
        System.out.println(ansCount);
        Collections.sort(arr);
        for (int size : arr) {
            System.out.print(size + " ");
        }
    }

    private static void DFS(int x, int y) {
        if (!area[x][y]){
            area[x][y] = true;
            temp++;
            for (int i = 0; i < 4; i++) {
                int nextX = x+ udlrX[i];
                int nextY = y+ udlrY[i];
                if (nextX >= 0 && nextX < area.length && nextY >= 0 && nextY < area[0].length){
                    DFS(nextX, nextY);
                }
            }
        }
    }
}
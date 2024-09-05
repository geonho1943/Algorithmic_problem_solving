package org.problem.solving.BOJ.Java14500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java14500 {
    static int[] xmove = {1,-1, 0, 0};
    static int[] ymove = {0, 0, 1,-1};
    static int N;
    static int M;
    static int ans = 0;
    static boolean[][] visit;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visit = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }// 입력 끝

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visit[i][j] = true;
                ttbfs(i,j, 1, arr[i][j]);
                visit[i][j] = false;
            }
        }
        System.out.println(ans);

    }

    private static void ttbfs(int i, int j, int count, int sum) {
        if (count == 4){
            //4개까지만 체크 하기
            ans = Math.max(ans, sum);
            return;
        }
        for (int k = count; k <= 4; k++) {
            for (int l = 0; l < 4; l++) {
                int ttX = i+xmove[l];
                int ttY = j+ymove[l];
                if (ttX < 0 || ttY < 0 || ttX >= N || ttY >= M) continue;
                if (!visit[ttX][ttY]){
                    if (count == 2){
                        //ㅗ 모양 일때 한번더 탐색 후 4구간의 합 - 가장 작은 값 빼기
                        visit[ttX][ttY] = true;
                        ttbfs(i,j,count+1 ,sum+arr[ttX][ttY]);
                        visit[ttX][ttY] = false;
                    }
                    visit[ttX][ttY] = true;
                    ttbfs(ttX,ttY,count+1, sum+arr[ttX][ttY]);
                    visit[ttX][ttY] = false;
                }
            }
        }
    }
}

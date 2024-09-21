package org.problem.solving.BOJ.Java2096;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java2096 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];
        int[][][] dpMaxMin = new int[N][3][2]; //3차 인덱스의 0이 최대 1이 최소
        int max = 0;
        int min = Integer.MAX_VALUE;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        dpMaxMin[0][0][0] = arr[0][0];
        dpMaxMin[0][1][0] = arr[0][1];
        dpMaxMin[0][2][0] = arr[0][2]; // 최대합저장
        dpMaxMin[0][0][1] = arr[0][0];
        dpMaxMin[0][1][1] = arr[0][1];
        dpMaxMin[0][2][1] = arr[0][2]; // 최소합 저장
        for (int i = 1; i < N; i++) {
            // 0은 0과 1을 비교한다
            dpMaxMin[i][0][0] = Math.max(dpMaxMin[i-1][0][0],dpMaxMin[i-1][1][0]) + arr[i][0];
            dpMaxMin[i][0][1] = Math.min(dpMaxMin[i-1][0][1],dpMaxMin[i-1][1][1]) + arr[i][0];
            // 1은 0,1,2 다 비교 한다
            dpMaxMin[i][1][0] = Math.max(dpMaxMin[i-1][0][0],Math.max(dpMaxMin[i-1][1][0],dpMaxMin[i-1][2][0])) + arr[i][1];
            dpMaxMin[i][1][1] = Math.min(dpMaxMin[i-1][0][1],Math.min(dpMaxMin[i-1][1][1],dpMaxMin[i-1][2][1])) + arr[i][1];
            // 2는 1,2 와 비교한다
            dpMaxMin[i][2][0] = Math.max(dpMaxMin[i-1][1][0],dpMaxMin[i-1][2][0]) + arr[i][2];
            dpMaxMin[i][2][1] = Math.min(dpMaxMin[i-1][1][1],dpMaxMin[i-1][2][1]) + arr[i][2];
        }
        max = Math.max(dpMaxMin[N-1][0][0],Math.max(dpMaxMin[N-1][1][0],dpMaxMin[N-1][2][0]));
        min = Math.min(dpMaxMin[N-1][0][1],Math.min(dpMaxMin[N-1][1][1],dpMaxMin[N-1][2][1]));
        System.out.println(max+" "+min);
    }
}

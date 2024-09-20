package org.problem.solving.BOJ.Java11660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            // 좌표 받기
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }

        }
        for (int i = 0; i < M; i++) {
            // xy 누적합 출력
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int ans =0;
            int temp = x1;
            while (x1 <= x2 && y1 <= y2){
                ans += arr[x1-1][y1-1];
                if (x1+1 > N || x1+1 > x2){
                    x1 = temp;
                    y1+=1;
                }else x1+=1;
            }
            System.out.println(ans);
        }

    }
}

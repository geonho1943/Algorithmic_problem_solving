package org.problem.solving.BOJ.Java11758;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11758_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[3][2];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 벡터의 외적 계산
        int crossProduct = (arr[1][0] - arr[0][0]) * (arr[2][1] - arr[0][1]) -
                (arr[1][1] - arr[0][1]) * (arr[2][0] - arr[0][0]);

        if (crossProduct > 0) {
            System.out.println(1);  // 반시계 방향
        } else if (crossProduct < 0) {
            System.out.println(-1); // 시계 방향
        } else {
            System.out.println(0);  // 일직선 상에 있음
        }
    }
}
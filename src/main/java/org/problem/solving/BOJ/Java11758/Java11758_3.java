package org.problem.solving.BOJ.Java11758;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11758_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[3][2];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        // 신발끈 공식 사용
        int a = arr[0][0] * arr[1][1] + arr[1][0] * arr[2][1] + arr[2][0] * arr[0][1];
        int b = arr[0][1] * arr[1][0] + arr[1][1] * arr[2][0] + arr[2][1] * arr[0][0];
        int ans = a - b;

        if (ans > 0) {
            System.out.println(1);// 반시계 방향
        } else if (ans < 0) {
            System.out.println(-1);// 시계
        } else {
            System.out.println(0);// 직선
        }
    }
}
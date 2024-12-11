package org.problem.solving.BOJ.Java11054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java11054_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] lis = new int[N]; // 증가 부분 수열 길이
        int[] lds = new int[N]; // 감소 부분 수열 길이

        // LIS 계산
        for (int i = 0; i < N; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        // LDS 계산
        for (int i = N - 1; i >= 0; i--) {
            lds[i] = 1;
            for (int j = N - 1; j > i; j--) {
                if (arr[j] < arr[i]) {
                    lds[i] = Math.max(lds[i], lds[j] + 1);
                }
            }
        }

        // 최대 바이토닉 길이 계산
        int maxLength = 0;
        for (int i = 0; i < N; i++) {
            maxLength = Math.max(maxLength, lis[i] + lds[i] - 1);
        }

        // 결과 출력
        System.out.println(maxLength);
    }
}
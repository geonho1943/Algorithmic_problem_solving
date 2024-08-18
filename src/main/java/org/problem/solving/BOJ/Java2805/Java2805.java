package org.problem.solving.BOJ.Java2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int max = 0;

        // 나무 높이 입력 및 최대 높이 찾기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) max = arr[i];
        }

        int min = 0;
        int result = 0;

        // 이진 탐색
        while (min <= max) {
            int mid = (min + max) / 2;
            long tree = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) tree += arr[i] - mid;
            }

            if (tree >= m) {
                result = mid; // 가능한 높이 저장
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        System.out.println(result);
    }
}
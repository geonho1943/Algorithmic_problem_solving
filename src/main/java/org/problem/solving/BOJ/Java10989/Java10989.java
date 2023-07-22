package org.problem.solving.BOJ.Java10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Java10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 수의 개수 입력

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine()); // 수 입력
        }

        Arrays.sort(arr); // 배열을 오름차순으로 정렬

        for (int num : arr) {
            System.out.println(num); // 정렬된 수 출력
        }
    }
}

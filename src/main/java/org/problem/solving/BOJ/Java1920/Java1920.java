package org.problem.solving.BOJ.Java1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int key = Integer.parseInt(st.nextToken());
            int lo = 0;
            int hi = N - 1;
            boolean ans = false;

            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (key < arr[mid]) {
                    hi = mid - 1;
                } else if (key > arr[mid]) {
                    lo = mid + 1;
                } else {
                    ans = true;
                    break;
                }
            }
            if (ans) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
}

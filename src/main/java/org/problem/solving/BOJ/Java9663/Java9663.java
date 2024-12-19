package org.problem.solving.BOJ.Java9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java9663 {
    static int N;
    static int ans = 0;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        search(0);
        System.out.println(ans);
    }

    private static void search(int depth) {
        if (depth == N){
            ans++;
            return;
        }
        for (int i = 0; i < N; i++) { // 깊이 기준 탐색
            boolean isSafe = true;
            for (int j = 0; j < depth; j++) { // 모든 퀸과 비교
                // 일직선 || 대각선
                if (arr[j] == i || Math.abs(depth - j) == Math.abs(i - arr[j])) {
                    isSafe = false;
                    break;
                }
            }
            if (isSafe) { // 만족할 경우
                arr[depth] = i; // 퀸 배치
                search(depth + 1); // 다음 깊이 탐색
            }
        }
    }

}
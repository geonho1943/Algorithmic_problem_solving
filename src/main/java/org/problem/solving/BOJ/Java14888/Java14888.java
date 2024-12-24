package org.problem.solving.BOJ.Java14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java14888 {
    static int N;
    static int[] arr;
    static int[] cal;
    static int maxNum = Integer.MIN_VALUE;
    static int minNum = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        cal = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            cal[i] = Integer.parseInt(st.nextToken());
        }
        // 입력 종료
        dfs(arr[0], 1);
        System.out.println(maxNum);
        System.out.println(minNum);
    }
    private static void dfs(int temp, int depth) {
        if (depth == N){
            maxNum = Math.max(maxNum, temp);
            minNum = Math.min(minNum, temp);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (cal[i] > 0){
                cal[i]--;
                switch (i) {
                    case 0:
                        dfs(temp + arr[depth], depth+1);
                        break;
                    case 1:
                        dfs(temp - arr[depth], depth+1);
                        break;
                    case 2:
                        dfs(temp * arr[depth], depth+1);
                        break;
                    case 3:
                        dfs(temp / arr[depth], depth+1);
                        break;
                }
                cal[i]++;
            }
        }
    }
}
package org.problem.solving.BOJ.Java10942;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java10942 {
    static int[] arr;
    static boolean[][] table;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        table = new boolean[N][N];
        dp();
        int M = Integer.parseInt(br.readLine());
        int s, e;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            e = Integer.parseInt(st.nextToken())-1;
            s = Integer.parseInt(st.nextToken())-1;
            if (table[s][e]){
                sb.append(1+"\n");
            }else sb.append(0+"\n");
        }
        System.out.println(sb);
    }

    private static void dp() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j){ // 수열의 길이: 1
                    table[i][j] = true;
                } else if (Math.abs(j-i) == 1 && arr[i] == arr[j]){ // 수열의 길이: 2 / 동일한 값
                    table[i][j] = true;
                } else if (table[i-1][j+1] && arr[i] == arr[j]) { // 내부 펠린트 + 양 끝 수가 같을때
                    table[i][j] = true;
                }
            }
        }
    }
}
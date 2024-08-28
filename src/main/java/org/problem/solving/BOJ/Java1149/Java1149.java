package org.problem.solving.BOJ.Java1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] sumPrice = new int[N][3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        sumPrice[0][0] = Integer.parseInt(st.nextToken());
        sumPrice[0][1] = Integer.parseInt(st.nextToken());
        sumPrice[0][2] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                sumPrice[i][j] = Integer.parseInt(st.nextToken());
            }
            sumPrice[i][0] += Math.min(sumPrice[i-1][1],sumPrice[i-1][2]);
            sumPrice[i][1] += Math.min(sumPrice[i-1][0],sumPrice[i-1][2]);
            sumPrice[i][2] += Math.min(sumPrice[i-1][0],sumPrice[i-1][1]);
        }
        System.out.println(Math.min(sumPrice[N-1][0],Math.min(sumPrice[N-1][1],sumPrice[N-1][2])));
    }
}
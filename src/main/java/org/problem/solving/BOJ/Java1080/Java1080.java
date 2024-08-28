package org.problem.solving.BOJ.Java1080;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1080 {
    static int[][] mapA;
    static int[][] mapB;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        mapA = new int[N][M];
        mapB = new int[N][M];
        for (int i = 0; i < N; i++) {
            String arr = br.readLine();
            for (int j = 0; j < M; j++) {
                mapA[i][j] = arr.charAt(j);
            }
        }
        for (int i = 0; i < N; i++) {
            String arr = br.readLine();
            for (int j = 0; j < M; j++) {
                mapB[i][j] = arr.charAt(j);
            }
        }
        //48 = 0 / 49 = 1
        if (N < 3 || M < 3){
            if (isSameMap(N,M)){
                System.out.println(0);
            }else System.out.println(-1);
            return;
        }
        int ans = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < M - 2; j++) {
                if (mapA[i][j]!=mapB[i][j]){
                    changeMap(i,j);
                    ans++;
                }
            }
        }
        if (!isSameMap(N,M)) ans = -1;
        System.out.println(ans);
    }

    private static void changeMap(int i, int j) {
        for (int k = i; k < i+3; k++) {
            for (int l = j; l <j+3; l++) {
                if (mapA[k][l]==48){
                    mapA[k][l]++;
                } else if (mapA[k][l] == 49) {
                    mapA[k][l]--;
                }else System.out.println("입력 오류");
            }
        }
    }

    private static boolean isSameMap(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mapA[i][j] != mapB[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}

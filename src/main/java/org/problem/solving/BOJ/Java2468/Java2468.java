package org.problem.solving.BOJ.Java2468;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java2468 {
    static int N;
    static int[][] arr;
    static boolean[][] check;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int ans = 0;
        for (int k = 2; k < 100; k++) { // 무조건 1의값 1, 100의값 0
            check = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!check[i][j] && arr[i][j] >= k){
                        dfs(i,j, k);
                        count++;
                    }
                }
            }
            if (count == 0) count=1;
            ans = Math.max(ans,count);
            count =0;
        }
        System.out.println(ans);

    }

    private static void dfs(int i, int j, int rainDepth) {
        if (!check[i][j]){ // 가본적 없는 곳
            check[i][j]=true;
            if (arr[i][j] >=rainDepth){ // 물보다 지형이높을때
                // 범위속의 상하좌우 재귀
                if (i+1 < N){
                    dfs(i+1, j, rainDepth);
                }
                if (i-1 >=0){
                    dfs(i-1, j, rainDepth);
                }
                if (j+1 < N){
                    dfs(i, j+1, rainDepth);
                }
                if (j-1 >= 0){
                    dfs(i, j-1, rainDepth);
                }
            }
        }
    }
}
package org.problem.solving.BOJ.Java1912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1912_2 {
    static int N;
    static int[] arr;
    static boolean[][] check;
    static int sum = 0;
    static int maxSum = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        check = new boolean[N][N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum+=arr[i];
        }
        dp(0,N-1,sum);
        System.out.println(maxSum);
    }

    private static void dp(int x, int y, int sum) {
        if (x < N && y >= 0 && x <= y && !check[x][y]){
            check[x][y] = true;
            check[y][x] = true;
            if (maxSum < sum){
                maxSum = sum;
            }
            dp(x+1,y,sum-arr[x]);
            dp(x,y-1,sum-arr[y]);
        }
    }

}
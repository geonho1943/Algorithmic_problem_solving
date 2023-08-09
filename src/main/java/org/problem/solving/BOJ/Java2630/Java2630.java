package org.problem.solving.BOJ.Java2630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java2630 {
    static int[][] arr;
    static int ans0=0;
    static int ans1=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int xStart=0;
        int xEnd = N;
        int yStart=0;
        int yEnd=N;
        asd(xStart, xEnd, yStart, yEnd);
        System.out.println(ans0);
        System.out.println(ans1);
    }

    private static void asd(int xStart, int xEnd, int yStart, int yEnd) {
        boolean allClear = true;
        int color = arr[xStart][yStart];
        for (int i = xStart; i < xEnd; i++) {
            for (int j = yStart; j < yEnd; j++) {
                if (color != arr[i][j]){
                    allClear = false;
                    break;
                }
            }
        }
        if (!allClear){
            int xMid = (xStart + xEnd) / 2;
            int yMid = (yStart + yEnd) / 2;

            asd(xStart,xMid,yStart,yMid);
            asd(xMid,xEnd,yStart,yMid);
            asd(xStart,xMid,yMid,yEnd);
            asd(xMid,xEnd,yMid,yEnd);
        }else {
            if (color ==0){
                ans0++;
            }
            if (color ==1){
                ans1++;
            }
        }
    }

}

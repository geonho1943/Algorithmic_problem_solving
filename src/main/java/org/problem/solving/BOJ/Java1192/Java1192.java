package org.problem.solving.BOJ.Java1192;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        double maxAns = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    //점 i, j, k 가 주워질때
//                    int maxX = Math.max(arr[i][0],Math.max(arr[j][0],arr[k][0]));
//                    int minX = Math.min(arr[i][0],Math.min(arr[j][0],arr[k][0]));
//                    int maxY = Math.max(arr[i][1],Math.max(arr[j][1],arr[k][1]));
//                    int minY = Math.min(arr[i][1],Math.min(arr[j][1],arr[k][1]));
//                    int tempExtent = ((maxX-minX)*(maxY-minY))/2;
                    double tempExtent = Math.abs(
                            arr[i][0] * arr[j][1] +
                                    arr[j][0] * arr[k][1] +
                                    arr[k][0] * arr[i][1] -
                                    arr[j][0] * arr[i][1] -
                                    arr[k][0] * arr[j][1] -
                                    arr[i][0] * arr[k][1]);
                    if (tempExtent > maxAns) {
                        maxAns = tempExtent;
                    }
                }
            }
        }
        System.out.printf("%.1f%n", maxAns/2);
    }
}

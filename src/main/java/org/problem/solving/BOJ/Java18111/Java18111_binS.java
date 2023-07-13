package org.problem.solving.BOJ.Java18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java18111_binS {
    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] ground = new int[N][M];
        int min = 256;
        int max = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, ground[i][j]);
                max = Math.max(max, ground[i][j]);
            }
        }
        long startTime = System.currentTimeMillis();

        int ansSec = Integer.MAX_VALUE;
        int ansFloor = 0;

        // 이분 탐색
        while (min <= max) {
            int midHeight = (min + max) / 2;
            int sec = 0;
            int inven = B;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    Thread.sleep(10);
                    int temp = ground[i][j] - midHeight;
                    if (temp > 0) {
                        sec += temp * 2;
                        inven += temp;
                    } else {
                        sec += Math.abs(temp);
                        inven -= Math.abs(temp);
                    }
                }
            }

            if (inven >= 0) {
                if (sec <= ansSec) {
                    ansSec = sec;
                    ansFloor = midHeight;
                }
                max = midHeight - 1;
            } else {
                min = midHeight + 1;
            }
        }

        System.out.println(ansSec + " " + ansFloor);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("바이너리서치 실행 시간: " + elapsedTime + "ms");
    }
}

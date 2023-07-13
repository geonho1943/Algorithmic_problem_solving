package org.problem.solving.BOJ.Java18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java18111 {
    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
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
        int ansFloor = Integer.MIN_VALUE;
        for (int i = min; i <= max; i++) {
            //i층당 시간,층 을 구한다
            int sec = 0;
            int inven = B;
            for (int j = 0; j < ground.length; j++) {
                for (int k = 0; k < ground[j].length; k++) {
                    Thread.sleep(10);
                    int state = ground[j][k]-i;
                    if (state < 0){
                        sec += Math.abs(state);
                        inven -= Math.abs(state);
                    } else if (state > 0) {
                        sec += Math.abs(state)*2;
                        inven += Math.abs(state);
                    }
                }
            }
            //보유 블럭으로 해결 가능 할때 각 층당 최적의 시간,층을 갱신 한다
            if (inven >=0){
                if (sec <= ansSec){
                    ansSec = sec;
                    ansFloor = i;
                }
            }
        }
        System.out.println(ansSec+" "+ansFloor);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("브루트 포스 실행 시간: " + elapsedTime + "ms");
    }
}

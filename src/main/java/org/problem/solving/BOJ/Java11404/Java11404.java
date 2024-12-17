package org.problem.solving.BOJ.Java11404;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java11404 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int inAccess = Integer.MAX_VALUE; // todo: 왜 100_001로는 97%에서 틀리는 거지?
        int[][] dist = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dist[i], inAccess);// 단방향에 연결 안되어 있을 수 도 있음  m 의 최댓값+1 을 주입
//            dist[i][i] = 0;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            int cost = Integer.parseInt(st.nextToken());
            dist[x][y] = Math.min(dist[x][y], cost);// 더 싼 가격 갱신
        }

        // 플루이드 구현
        for (int i = 0; i < N; i++) { // 거점 i 를 거칠때와 비교
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (dist[j][i] != inAccess && dist[i][k] != inAccess && j != k){ // 불가능, 자기자신 제외
                        dist[j][k] = Math.min(dist[j][k], dist[j][i] + dist[i][k]);
                    }
                }
            }
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (dist[i][0] == inAccess){
                sb.append(0);
            } else sb.append(dist[i][0]);
            for (int j = 1; j < N; j++) {
                if (dist[i][j] == inAccess){
                    sb.append(" 0");
                } else sb.append(" " + dist[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
package org.problem.solving.BOJ.Java1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java1012 {
    static int M;
    static int N;
    static int[][] arr;
    static boolean[][] vis;
    static int[] dx = { 0, -1, 0, 1 };
    static int[] dy = { 1, 0, -1, 0 };

    static void DFS(int x, int y){
        vis[x][y] =true;
        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
                if (!vis[cx][cy] && arr[cx][cy] == 1) {
                    DFS(cx, cy);
                }
            }

        }
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) { //testcase 만큼 실행
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            M = Integer.parseInt(st.nextToken());//가로
            N = Integer.parseInt(st.nextToken());//새로
            int K = Integer.parseInt(st.nextToken());//배추갯수
            arr = new int[M][N];
            vis = new boolean[M][N];
            for (int j = 0; j < K; j++) { //arr에 배추 위치 받기
                st = new StringTokenizer(br.readLine()," ");
                arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] =1;
            }
            int count =0;
            for (int j = 0; j < M; j++) {//배추 찾기
                for (int k = 0; k < N; k++) {
                    if (arr[j][k] == 1 && !vis[j][k]){//뭉탱이 배추 찾기
                        DFS(j,k);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

package org.problem.solving.BOJ.Java13565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java13565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = line.charAt(j) -'0';
//                arr[i][j] = (int) line.charAt(j) -48;
            }
        }
        boolean[][] visired = new boolean[M][N];
        Queue<int[]> que = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            que.add(new int[] {0,i});
            visired[0][i] = true;
        }
        while (!que.isEmpty()){
            int[] current = que.poll();
            int x = current[0];
            int y = current[1];
            if (x == M-1){
                System.out.println("YES");
                return;
            }
            if (y + 1 < N && arr[x][y + 1] == 0 && !visired[x][y + 1]){ // 통과물질, 좌표, 첫조회
                que.add(new int[] {x, y + 1}); // 우
                visired[x][y+1] = true;
            }
            if (y - 1 >= 0 && arr[x][y - 1] == 0 && !visired[x][y - 1]){
                que.add(new int[] {x, y - 1}); // 좌
                visired[x][y-1] = true;
            }
            if (x + 1 < M && arr[x + 1][y] == 0 && !visired[x + 1][y]){
                que.add(new int[] {x + 1, y}); // 하
                visired[x+1][y] = true;
            }
            if (x - 1 >= 0 && arr[x - 1][y] == 0 && !visired[x - 1][y]){
                que.add(new int[] {x - 1, y}); // 상
                visired[x-1][y] = true;
            }
        }
        System.out.println("NO");
    }
}